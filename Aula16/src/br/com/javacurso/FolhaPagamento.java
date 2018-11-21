package br.com.javacurso;

public class FolhaPagamento {
	
	public void imprimirFolha(Funcionario funcionario){
		System.out.println("=======================Folha de Pagamento===================");
		System.out.println(funcionario.getClass().getSimpleName().toUpperCase());
		System.out.printf("Codigo: %s\n", funcionario.getCodigo());
		System.out.printf("Nome: %s\n", funcionario.getNome());
		System.out.printf("Salario Base: %.2f\n", funcionario.getSalarioBase());
		System.out.printf("Salario Liquido: %.2f\n", funcionario.salarioLiquido());
		System.out.println("===========================================================");
	}//imprimirFolha
	

}//class
