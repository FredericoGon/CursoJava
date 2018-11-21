package br.com.cursojava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ContatoDAO {
	
	public List<Contato> buscarTodos(){
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Contato> query = em.createQuery("from Contato", Contato.class);
		List<Contato> lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public List<Contato> buscarPorNome(String nome){
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Contato> query = em.createQuery("from Contato c where upper(c.nome) like upper(:nome)", Contato.class);
		query.setParameter("nome", "%"+nome+"%");
		List<Contato> lista = query.getResultList();
		em.close();
		return lista;
	}
	
	public boolean inserir(Contato contato){
		boolean resultado = false;
		if (contato != null && contato.getId() == null){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(contato);
			em.getTransaction().commit();
			em.close();
			resultado = contato.getId() != null;
		}
		return resultado;	
	}
	
	public boolean atualizar(Contato contato){
		boolean resultado = false;
		if (contato != null && contato.getId() != null){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			em.merge(contato);
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
	}//atualizar
	
	public boolean remover(Contato contato){
		boolean resultado = false;
		if (contato != null && contato.getId() != null){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			contato = em.merge(contato);
			em.remove(contato);
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
	}//atualizar

}
