package br.com.javacurso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ChildDAO {
	
	public boolean inserir(Child child, Owner owner){
		boolean resultado = false;
		if(child != null && child.getId() == null && owner != null && owner.getId() == null){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(child);
			em.getTransaction().commit();
			em.close();
			resultado = child.getId() != null;
		}
		return resultado;
	}//inserir
	
	public boolean atualizar(Child child, Owner owner){
		boolean resultado = false;
		if(child != null && child.getId() != null && owner != null && owner.getId() != null){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			em.merge(child);
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
	
	public boolean remover(Integer id){
		boolean resultado = false;
		if (id > 0){
			EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
			try{
			em.getTransaction().begin();
			Child child = em.find(Child.class, id);
			em.remove(child);
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
	}//remover
	
	public List<Child> listarTodos(){
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		TypedQuery<Child> query = em.createQuery("from Child", Child.class);
		List<Child> lista = query.getResultList();
		em.close();
		return lista;
	}//listarTodos
	
	public Child buscarPorId(Integer id){
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		Child child = em.find(Child.class, id);
		em.close();
		return child;
	}//buscarPorId

}
