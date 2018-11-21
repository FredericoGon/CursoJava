package br.com.javacurso;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class TestesEsportes {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.geEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
//		Campeoes campeao = new Campeoes(null, "Ushimura", 25);
//		Esportes ginastica = new Esportes(null, "Ginástica Artística", 25689, campeao);
//		em.persist(ginastica);
//		
//		Campeoes campeao2 = new Campeoes(null, "Kobe Brian", 45);
//		Esportes basquete = new Esportes(null, "Basquetebol", 989, campeao2);
//		em.persist(basquete);
//		
//		Campeoes campeao3 = new Campeoes(null, "Tiger Woods", 39);
//		Esportes golf = new Esportes(null, "Golf", 666, campeao3);
//		em.persist(golf);
//		
//		Campeoes campeao4 = new Campeoes(null, "Gustavo Kuerten", 45);
//		Esportes tenis = new Esportes(null, "Tênis", 666, campeao4);
//		em.persist(tenis);
		
		System.out.println("\\\\Exemplo de Select all no JPQL: ////");
		String all = "from Esportes";
		Query query = em.createQuery(all);
		List<Esportes> listaAll = query.getResultList();
		for (Esportes esportes : listaAll) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de Select all no Criteria: ////");
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
		CriteriaQuery<Object[]> qco = cb.createQuery(Object[].class);
		Root<Esportes> cco = qco.from(Esportes.class);
		qco.select(cb.array(cco.get("nome"),cco.get("atletas")));
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
		CriteriaQuery<Object[]> qgb = cb.createQuery(Object[].class);
		Root<Esportes> cgb = qgb.from(Esportes.class);
		qgb.select(cb.array(cgb.get("nome"),cgb.get("atletas"),cgb.get("campeao_id").get("nome"), cgb.get("campeao_id").get("idade")));
		qgb.orderBy(cb.asc(cgb.get("nome")), cb.desc(cgb.get("atletas")));
		Query queryOrderb = em.createQuery(qgb);
		List<Object[]> resultor = queryOrderb.getResultList();
		for (Object[] objects : resultor) {
			System.out.println(objects[0]+" - "+objects[1]+" - "+objects[2]+" - "+objects[3]);
		}
		
		System.out.println("\\\\Exemplo de Count no JPQL: ////");
		String selectCount = "SELECT count(atletas) FROM Esportes";
		Query queryCount = em.createQuery(selectCount);
		Long contagem = (Long) queryCount.getSingleResult();
		System.out.println(contagem);
		
		System.out.println("\\\\Exemplo de Count no Criteria: ////");
		CriteriaQuery<Long> queryCCount = cb.createQuery(Long.class);
		queryCCount.select(cb.count(queryCCount.from(Esportes.class)));
		Query queryCCountFinal = em.createQuery(queryCCount);
		Long contagemCriteria = (Long) queryCCountFinal.getSingleResult();
		System.out.println(contagemCriteria);
		
		System.out.println("\\\\Exemplo de Max no JPQL: ////");
		String selectMax = "SELECT max(atletas) FROM Esportes";
		Query queryMax = em.createQuery(selectMax);
		Integer max = (Integer) queryMax.getSingleResult();
		System.out.println(max);
		
		System.out.println("\\\\Exemplo de Max no Criteria: ////");
		CriteriaQuery<Integer> queryCMax = cb.createQuery(Integer.class);
		Root<Esportes> rootMax = queryCMax.from(Esportes.class);
		queryCMax.select(cb.max(rootMax.get("atletas")));
		Query queryCMaxFinal = em.createQuery(queryCMax);
		Integer MaxCriteria = (Integer) queryCMaxFinal.getSingleResult();
		System.out.println(MaxCriteria);
		
		System.out.println("\\\\Exemplo de Min no JPQL: ////");
		String selectMin = "SELECT min(atletas) FROM Esportes";
		Query queryMin = em.createQuery(selectMin);
		Integer min = (Integer) queryMin.getSingleResult();
		System.out.println(min);
		
		System.out.println("\\\\Exemplo de Min no Criteria: ////");
		CriteriaQuery<Integer> queryCMin = cb.createQuery(Integer.class);
		Root<Esportes> rootMin = queryCMin.from(Esportes.class);
		queryCMin.select(cb.min(rootMin.get("atletas")));
		Query queryCMinFinal = em.createQuery(queryCMin);
		Integer MinCriteria = (Integer) queryCMinFinal.getSingleResult();
		System.out.println(MinCriteria);
		
		System.out.println("\\\\Exemplo de Avg no JPQL: ////");
		String selectAvg = "SELECT avg(atletas) FROM Esportes";
		Query queryAvg = em.createQuery(selectAvg);
		Double avg = (Double) queryAvg.getSingleResult();
		System.out.println(avg);
		
		System.out.println("\\\\Exemplo de Avg no Criteria: ////");
		CriteriaQuery<Double> queryCAvg = cb.createQuery(Double.class);
		Root<Esportes> rootAvg = queryCAvg.from(Esportes.class);
		queryCAvg.select(cb.avg(rootAvg.get("atletas")));
		Query queryCAvgFinal = em.createQuery(queryCAvg);
		Double AvgCriteria = (Double) queryCAvgFinal.getSingleResult();
		System.out.println(AvgCriteria);
		
		System.out.println("\\\\Exemplo de > no JPQL: ////");
		String selectMaiorQ = "FROM Esportes where atletas > 666";
		Query queryMaiorQ = em.createQuery(selectMaiorQ);
		List<Esportes> maiorQ = queryMaiorQ.getResultList();
		for (Esportes esportes : maiorQ) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de > no Criteria: ////");
		CriteriaQuery<Esportes> queryCMaiorQ = cb.createQuery(Esportes.class);
		Root<Esportes> rootMaiorQ = queryCMaiorQ.from(Esportes.class);
		queryCMaiorQ.select(rootMaiorQ);
		queryCMaiorQ.where(cb.gt(rootMaiorQ.get("atletas"), 666));
		Query queryMaiorQFinal = em.createQuery(queryCMaiorQ);
		List<Esportes> resultMaiorQ = queryMaiorQFinal.getResultList();
		for (Esportes esportes : resultMaiorQ) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de >= no JPQL: ////");
		String selectMaiorOuI = "FROM Esportes where atletas >= 666";
		Query queryMaiorOuI = em.createQuery(selectMaiorOuI);
		List<Esportes> maiorOuI = queryMaiorOuI.getResultList();
		for (Esportes esportes : maiorOuI) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de >= no Criteria: ////");
		CriteriaQuery<Esportes> queryCMaiorOuI = cb.createQuery(Esportes.class);
		Root<Esportes> rootMaiorOuI = queryCMaiorOuI.from(Esportes.class);
		queryCMaiorOuI.select(rootMaiorOuI);
		queryCMaiorOuI.where(cb.ge(rootMaiorOuI.get("atletas"), 666));
		Query queryCMaiorOuIFinal = em.createQuery(queryCMaiorOuI);
		List<Esportes> resultMaiorOuI = queryCMaiorOuIFinal.getResultList();
		for (Esportes esportes : resultMaiorOuI) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de < no JPQL: ////");
		String selectMenor = "FROM Esportes where atletas < 989";
		Query queryMenor = em.createQuery(selectMenor);
		List<Esportes> MenorQ = queryMenor.getResultList();
		for (Esportes esportes : MenorQ) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de < no Criteria: ////");
		CriteriaQuery<Esportes> queryCMenorQ = cb.createQuery(Esportes.class);
		Root<Esportes> rootMenorQ = queryCMenorQ.from(Esportes.class);
		queryCMenorQ.select(rootMenorQ);
		queryCMenorQ.where(cb.lt(rootMenorQ.get("atletas"), 989));
		Query queryMenorQ = em.createQuery(queryCMenorQ);
		List<Esportes> resultMenorQ = queryMenorQ.getResultList();
		for (Esportes esportes : resultMenorQ) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de <= no JPQL: ////");
		String selectMenorOuI = "FROM Esportes where atletas <= 989";
		Query queryMenorOuI = em.createQuery(selectMenorOuI);
		List<Esportes> MenorOuI = queryMenorOuI.getResultList();
		for (Esportes esportes : MenorOuI) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de <= no Criteria: ////");
		CriteriaQuery<Esportes> queryCMenorOuI = cb.createQuery(Esportes.class);
		Root<Esportes> rootMenorOuI = queryCMenorOuI.from(Esportes.class);
		queryCMenorOuI.select(rootMenorOuI);
		queryCMenorOuI.where(cb.le(rootMenorOuI.get("atletas"), 989));
		Query queryMenorOuIFinal = em.createQuery(queryCMenorOuI);
		List<Esportes> resultMenorOuI = queryMenorOuIFinal.getResultList();
		for (Esportes esportes : resultMenorOuI) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de <> no JPQL: ////");
		String selectDiferente = "FROM Esportes where atletas <> 666";
		Query queryDiferente = em.createQuery(selectDiferente);
		List<Esportes> diferente = queryDiferente.getResultList();
		for (Esportes esportes : diferente) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de <> no Criteria: ////");
		CriteriaQuery<Esportes> queryCDiferente = cb.createQuery(Esportes.class);
		Root<Esportes> rootDiferente = queryCDiferente.from(Esportes.class);
		queryCDiferente.select(rootDiferente);
		queryCDiferente.where(cb.notEqual(rootDiferente.get("atletas"), 666));
		Query queryDiferenyeFinal = em.createQuery(queryCDiferente);
		List<Esportes> resultDiferente = queryDiferenyeFinal.getResultList();
		for (Esportes esportes : resultDiferente) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de And no JPQL: ////");
		String selectAnd = "FROM Esportes where atletas > 666 and atletas < 2500";
		Query queryAnd = em.createQuery(selectAnd);
		List<Esportes> and = queryAnd.getResultList();
		for (Esportes esportes : and) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de And no Criteria: ////");
		CriteriaQuery<Esportes> queryCAnd = cb.createQuery(Esportes.class);
		Root<Esportes> rootAnd = queryCAnd.from(Esportes.class);
		queryCAnd.select(rootAnd);
		Predicate maior = cb.gt(rootAnd.get("atletas"), 666);
		Predicate menor = cb.lt(rootAnd.get("atletas"), 2500);
		Predicate criteriaAnd = cb.and(maior, menor);
		queryCAnd.where(criteriaAnd);
		Query queryAndFinal = em.createQuery(queryCAnd);
		List<Esportes> resultAnd = queryAndFinal.getResultList();
		for (Esportes esportes : resultAnd) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de Or no JPQL: ////");
		String selectOr = "FROM Esportes where atletas <700 or atletas >1500";
		Query queryOr = em.createQuery(selectOr);
		List<Esportes> or = queryOr.getResultList();
		for (Esportes esportes : or) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de Or no Criteria: ////");
		CriteriaQuery<Esportes> queryCOr = cb.createQuery(Esportes.class);
		Root<Esportes> rootOr = queryCOr.from(Esportes.class);
		queryCOr.select(rootOr);
		Predicate menor2 = cb.lt(rootOr.get("atletas"), 700);
		Predicate maior2 = cb.gt(rootOr.get("atletas"), 1500);
		Predicate criteriaOr = cb.or(menor2, maior2);
		queryCOr.where(criteriaOr);
		Query queryOrFinal = em.createQuery(queryCOr);
		List<Esportes> resultOr = queryOrFinal.getResultList();
		for (Esportes esportes : resultOr) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de Like no JPQL: ////");
		String selectLike = "FROM Esportes where nome like '%ol%'";
		Query queryLike = em.createQuery(selectLike);
		List<Esportes> like = queryLike.getResultList();
		for (Esportes esportes : like) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo de Like no Criteria: ////");
		CriteriaQuery<Esportes> queryCLike = cb.createQuery(Esportes.class);
		Root<Esportes> rootLike = queryCLike.from(Esportes.class);
		queryCLike.select(rootLike);
		Predicate likeC = cb.like(rootLike.get("nome"),"%ol%");
		queryCLike.where(likeC);
		Query queryLikeFinal = em.createQuery(queryCLike);
		List<Esportes> resultLike = queryLikeFinal.getResultList();
		for (Esportes esportes : resultLike) {
			System.out.println(esportes);
		}
		
		System.out.println("\\\\Exemplo Join no JPQL: ////");
		String selectJoin = "select e.nome, c.nome from Esportes e join e.campeao_id c";
		Query queryJoin = em.createQuery(selectJoin);
		List<Object[]> join = queryJoin.getResultList();
		for (Object[] esportes : join) {
			System.out.println(esportes[0]+" - "+esportes[1]);
		}
		
		System.out.println("\\\\Exemplo de Join no Criteria: ////");
		CriteriaQuery<Object[]> queryCJoin = cb.createQuery(Object[].class);
		Root<Esportes> rootJoin = queryCJoin.from(Esportes.class);
		Join<Esportes, Campeoes> rootJoinJ = rootJoin.join("campeao_id", JoinType.INNER); 
		queryCJoin.multiselect(rootJoin, rootJoinJ);
		
		Query queryJoinFinal = em.createQuery(queryCJoin);
		List<Object[]> resultJoin = (List<Object[]>) queryJoinFinal.getResultList();
		for (Object[] esportes : resultJoin) {
			System.out.println(esportes[0]+" - "+esportes[1]);
		}
		
		System.out.println("\\\\Exemplo Group By no JPQL: ////");
		String selectGroup = "select e.atletas, sum(e.atletas) from Esportes e group by e.atletas";
		Query queryGroup = em.createQuery(selectGroup);
		List<Object[]> group = queryGroup.getResultList();
		for (Object[] esportes : group) {
			System.out.println(esportes[0]+" - "+esportes[1]);
		}
		
		System.out.println("\\\\Exemplo de Group By no Criteria: ////");
		CriteriaQuery<Object[]> queryCGroup = cb.createQuery(Object[].class);
		Root<Esportes> rootGroup = queryCGroup.from(Esportes.class);
		queryCGroup.multiselect(rootGroup.get("atletas"), cb.count(rootGroup.get("atletas")));
		queryCGroup.groupBy(rootGroup.get("atletas"));
		Query queryGroupFinal = em.createQuery(queryCGroup);
		List<Object[]> groupC = queryGroupFinal.getResultList();
		for (Object[] esportes : groupC) {
			System.out.println(esportes[0]+" - "+esportes[1]);
		}
		
		System.out.println();
		em.getTransaction().commit();
		em.close();
		JPAUtil.shutdown();
	}
}
