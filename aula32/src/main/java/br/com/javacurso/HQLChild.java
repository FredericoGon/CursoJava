package br.com.javacurso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class HQLChild {
	
	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		
//		Owner pai = new Owner(null, "Maezona");
//		Child filho = new Child(null, "Filhona", pai);
//		
//		em.persist(filho);
		
		System.out.println("Exemplo de Select all no HQL: ");
		String all = "from Child";
		Query query = em.createQuery(all);
		List<Child> lista = query.getResultList();
		for (Child child : lista) {
			System.out.println(child);
		}
		
		System.out.println("Exemplo de Select all no Criteria: ");
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Child> q = cb.createQuery(Child.class);
		Root<Child> c = q.from(Child.class);
		q.select(c);
		Query query3 = em.createQuery(q);
		List<Child> results = query.getResultList();
		for (Child child : results) {
			System.out.println(child);
		}

		System.out.println("Exemplo de Select coluna no HQL: ");
		String selectColuna = "Select nome from Child";
		Query query2 = em.createQuery(selectColuna);
		List<String> lista2 = query2.getResultList();
		for (String string : lista2) {
			System.out.println(string);
		}
		
		System.out.println("Exemplo de Select colunas no HQL: ");
		String selectColunas = "Select nome, id from Child";
		Query querycolunas = em.createQuery(selectColunas);
		List<Object[]> listacolunas = querycolunas.getResultList();
		for (Object[] string : listacolunas) {
			System.out.println(string[0]+" - "+string[1]);
		}
		

		
		
		
		em.getTransaction().commit();
		em.close();
		JPAUtil.shutdown();
		
	}

}
