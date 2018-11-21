package br.com.javacurso;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory geEntityManagerFactory(){
		if (factory == null){
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}
	
	public static void shutdown(){
		if (factory != null){
			factory.close();
		}
	}

}
