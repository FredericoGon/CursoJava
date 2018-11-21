package br.com.javacurso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProdutoDAO implements RepositorioProduto{

	@Override
	public List<Produto> buscarTodos() {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto", Produto.class);
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}

	@Override
	public List<Produto> buscarPorNome(String nome) {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto c where upper(c.nome) like upper(:nome)", Produto.class);
		query.setParameter("nome", "%"+nome+"%");
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}

	@Override
	public List<Produto> buscarPorPreco(double minimo, double maximo) {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto c where preco > :minimo and preco < :maximo", Produto.class);
		query.setParameter("minimo", minimo);
		query.setParameter("maximo", maximo);
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		Produto produto = em.find(Produto.class, id);
		em.close();
		return produto;
	}

	@Override
	public boolean inserir(Produto produto) {
		boolean resultado = false;
		if (produto != null && produto.getId() == null){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
			em.close();
			resultado = produto.getId() != null;
		}
		return resultado;	
	}

	@Override
	public boolean atualizar(Produto produto) {
		boolean resultado = false;
		if (produto != null && produto.getId() != null){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			em.merge(produto);
			em.getTransaction().commit();
			em.close();
			resultado = true;
			}catch(Exception e){
				if(em != null && em.isOpen()){
					em.getTransaction().rollback();
				}
			}
		}
		return resultado;
	}

	@Override
	public boolean remover(Integer id) {
		boolean resultado = false;
		if (id > 0){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			Produto produto = em.find(Produto.class, id);
			em.remove(produto);
			em.getTransaction().commit();
			em.close();
			resultado = true;
			}catch(Exception e){
				if(em != null && em.isOpen()){
					em.getTransaction().rollback();
				}
			}
		}
		return resultado;
	}

	@Override
	public int contar() {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("count(*) from Produto", Produto.class);
		Integer quantidade = query.getFirstResult();
		em.close();
		return quantidade;
	}

}
