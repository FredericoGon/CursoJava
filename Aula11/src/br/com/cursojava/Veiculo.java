package br.com.cursojava;

public class Veiculo {
	
	String marca;
	String modelo;
	String cor;
	int anoFabricacao;
	int anoModelo;
	
	void configuraMarca(String marca){
		this.marca = marca;
	}
	
	void configuraModelo(String modelo){
		this.modelo = modelo;
	}
	
	void configuraCor(String cor){
		this.cor = cor;
	}
	
	void configuraAnoFabricacao(int anoFabricacao){
		this.anoFabricacao = anoFabricacao;
	}
	
	void configuraAnoModelo(int anoModelo){
		this.anoModelo = anoModelo;
	}
	
	String retornaMarca(){
		return marca;
	}
	
	String retornaModelo(){
		return modelo;
	}
	
	String retornaCor(){
		return cor;
	}
	
	int retornaAnoFabricacao(){
		return anoFabricacao;
	}
	
	int retornaAnoModelo(){
		return anoModelo;
	}
	
}
