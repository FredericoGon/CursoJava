package br.com.javacurso;

public class App {
	
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setCodigo("FUNC-0001");
		func.setNome("João da Silva");
		func.setSalarioBase(1000);
		
		Vendedor vend = new Vendedor("VEND-0001", "Achmed Mohamed", 1000);
		vend.setPercentualVenda(0.05);
		vend.setTotalVendas(100000);
		
		FolhaPagamento folha = new FolhaPagamento();
		folha.imprimirFolha(func);
		folha.imprimirFolha(vend);
		
		Funcionario fv = new Vendedor("codigo123", "Nome Vendedor", 1200);
		
		//fv.setCodigo("codigo123");
		//fv.setNome("Nome Vendedor");
		//fv.setSalarioBase(1200);
		if (fv instanceof Vendedor){
			((Vendedor)fv).setPercentualVenda(0.1);//cast para vendedor
			((Vendedor)fv).setTotalVendas(20000);
		}
		
		folha.imprimirFolha(fv);
		
		//Vendedor v = new Funcionario(); classe vendedor possui mais característica do que funcionario, por isso não funciona.
		
		
	}//main

}//class
