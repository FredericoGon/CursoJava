package br.com.javacurso;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.EntityManager;

public class testeTarefa {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		
		Tarefa t1 = new Tarefa(null, "tarefa do Bagrinho99", StatusTarefa.NOVA, new Date(), new Date());
		Usuario u = new Usuario(null, "Bagrinho99", "b99@teste.com", Arrays.asList(t1));
		
		em.persist(u);
		
//		Tarefa tarefa = new Tarefa();
//		tarefa.setTitulo("Minha primeira tarefa");
//		tarefa.setStatus(StatusTarefa.NOVA);
//		tarefa.setCriadoEm(new Date());
//		tarefa.setAtualizadoEm(new Date());
//		em.persist(tarefa);
		
		
		System.out.println();
		em.getTransaction().commit();
		em.close();
		JPAUtil.shutdown();
	}

}
