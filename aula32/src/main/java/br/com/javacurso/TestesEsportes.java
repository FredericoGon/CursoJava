package br.com.javacurso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class TestesEsportes {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		
//		Campeoes campeao = new Campeoes(null, "Gustavo Kuerten", 45);
//		Esportes tenis = new Esportes(null, "Tênis", 666, campeao);
//		em.persist(tenis);
		
		System.out.println("\\\\Exemplo de Select all no JPQL: ////");
		String all = "from Esportes";
		Query query = em.createQuery(all);
		List<Esportes> listaAll = query.getResultList();
		for (Esportes esportes : listaAll) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de Select all no Criteria: ////");
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Esportes> q = cb.createQuery(Esportes.class);
		Root<Esportes> c = q.from(Esportes.class);
		q.select(c);
		Query queryAll = em.createQuery(q);
		List<Esportes> results = queryAll.getResultList();
		for (Esportes esportes : listaAll) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de Select coluna no JPQL: ////");
		String selectColuna = "Select nome from Esportes";
		Query query2 = em.createQuery(selectColuna);
		List<String> listacoluna = query2.getResultList();
		for (String string : listacoluna) {
			System.out.println(string);
		}
		
		System.out.println("\\\\Exemplo de Select colunas no JPQL: ////");
		String selectColunas = "Select nome, atletas from Esportes";
		Query querycolunas = em.createQuery(selectColunas);
		List<Object[]> listacolunas = querycolunas.getResultList();
		for (Object[] objects : listacolunas) {
			System.out.println(objects[0]+" - "+objects[1]);
		}
		
		System.out.println("\\\\Exemplo de Select Coluna no Criteria: ////");
		CriteriaBuilder cbco = em.getCriteriaBuilder();
		CriteriaQuery<Object[]> qco = cbco.createQuery(Object[].class);
		Root<Esportes> cco = qco.from(Esportes.class);
		qco.select(cbco.array(cco.get("nome"),cco.get("atletas")));
		Query queryCo = em.createQuery(qco);
		List<Object[]> resultco = queryCo.getResultList();
		for (Object[] objects : resultco) {
			System.out.println(objects[0]+" - "+objects[1]);
		}
		
		System.out.println("\\\\Exemplo de Order By no JPQL: ////");
		String selectOrder = "Select nome from Esportes as e Order By e.nome";
		Query queryOrder = em.createQuery(selectOrder);
		List<String> listaorder = queryOrder.getResultList();
		for (String string : listaorder) {
			System.out.println(string);
		}
		
		System.out.println("\\\\Exemplo de Order By no Criteria: ////");
		CriteriaBuilder cb2 = em.getCriteriaBuilder();
		CriteriaQuery<Esportes> qgb = cb2.createQuery(Esportes.class);
		Root<Esportes> cgb = qgb.from(Esportes.class);
		qgb.select(cgb);
		qgb.orderBy(cb2.asc(cgb.get("nome")), cb2.desc(cgb.get("atletas")));
		Query queryOrderb = em.createQuery(qgb);
		List<Esportes> resultor = queryOrderb.getResultList();
		for (Esportes esportes : resultor) {
			System.out.println(esportes);
		}
		
		
		
		System.out.println();
		em.getTransaction().commit();
		em.close();
		JPAUtil.shutdown();
	}

}
