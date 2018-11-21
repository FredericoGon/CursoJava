package br.com.javacurso;

import java.util.List;

public class Testes {
	
	public static void main(String[] args) {
		ChildDAO dao = new ChildDAO();

//		Owner own1 = new Owner(null, "Master of Puppets");
//		Child cria1 = new Child(null, "Puppet 01", own1);
//		
//		Owner own2 = new Owner(null, "Puppet King");
//		Child cria2 = new Child(null, "Hyper Puppet", own2);
//		
//		dao.atualizar(cria, own);		
//		dao.remover(1);
//		dao.inserir(cria1, own1);
//		dao.inserir(cria2, own2);
		
		
//		System.out.println(child.getId());
//		System.out.println(child.getNome());
//
//		System.out.println(child.getOwner().getNome());
		List<Child> lista = dao.listarTodos();
//		Child atual = null;
//		for (int i = 0; i < lista.size();i++){
//			atual = lista.get(i);
//			System.out.printf("%d - %s - %s\n",atual.getId(), atual.getNome(), atual.getOwner().getNome());
//		}
		
		System.out.println(lista.size());
		
		System.out.println(dao.buscarPorId(3).getOwner().getNome());
		
		for (Child child : lista) {
			System.out.printf("%d - %s - %s\n",child.getId(), child.getNome(), child.getOwner().getNome());
		}
		
	}//main
}//class