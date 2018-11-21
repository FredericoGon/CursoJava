package br.com.cursojava;

import java.math.BigInteger;
import javax.persistence.EntityManager;

public class Main {
	
	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.geEntityManagerFactory().createEntityManager();
		
		Pessoa ana = new Pessoa(null, "Ana Maria Braga");
		
		entityManager.getTransaction().begin();
		//Pessoa anaSincronizada = entityManager.merge(ana);
		entityManager.persist(ana);
		
//		Pessoa p = entityManager.find(Pessoa.class, 1);
//		System.out.println(p.getId());
//		System.out.println(p.getNome());
//		p.setNome("Tibúrcio da Silva Brasil");

		
		String sql = "select count(*) from pessoas";
		BigInteger result = (BigInteger) entityManager.createNativeQuery(sql).getSingleResult();
		System.out.println(result.intValue());
		
//		System.out.println(p.getId());
//		System.out.println(p.getNome());
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
		JPAUtil.shutdown();
		System.exit(0);
	}
	
	

}
