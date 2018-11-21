package br.com.javacurso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class LancheDAO {
	
	public boolean inserir(Lanche lanche) {
		boolean resultado = false;
		if(lanche != null && lanche.getId() == null) {
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(lanche);
			em.getTransaction().commit();
			em.close();
			resultado = lanche.getId() != null;
		}
		return resultado;
	}//inserir
	
	public boolean atualizar(Lanche lanche) {
		boolean resultado = false;
		if(lanche != null && lanche.getId() != null) {
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(lanche);
				em.getTransaction().commit();
				em.close();
				resultado = true;
			}catch(Exception e) {
				if(em != null && em.isOpen()) {
					em.getTransaction().rollback();
				}
			}
		}
		return resultado;
	}//atualizar
	
	public boolean remover(Integer id) {
		boolean resultado = false;
			if(id>0) {
				EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
				try {
					em.getTransaction().begin();
					Lanche lanche = em.find(Lanche.class, id);
					em.remove(lanche);
					em.getTransaction().commit();
					em.close();
					resultado = true;
				}catch(Exception e) {
					if(em != null && em.isOpen()) {
						em.getTransaction().rollback();
					}
				}
			}
		return resultado;
	}//remover
	
	public List<Lanche> listarTodos(){
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Lanche> query = em.createQuery("from Lanche", Lanche.class);
		List<Lanche> lista = query.getResultList();
		return lista;
	}//listarTodos
	
	public List<Lanche> listarPorNome(String nome){
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Lanche> query = em.createQuery("from lanche c where upper(c.nome) like upper(:nome)", Lanche.class);
		query.setParameter("nome", "%"+nome+"%");
		List<Lanche> lista = query.getResultList();
		return lista;
	}//listarPorNome
	
	public Lanche procurarId(Integer id) {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		Lanche lanche = em.find(Lanche.class, id);
		em.close();
		return lanche;
	}

}
