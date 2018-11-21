package br.com.cursojava;

public class Aluno {
	
	String nome;
	String telefone;
	String matricula;
	
	void configuraNome(String nome){
		this.nome = nome;
	}
	
	void configuraTelefona(String telefone){
		this.telefone = telefone;
	}
	
	void configuraMatricula(String matricula){
		this.matricula = matricula;
	}
	
	String retornaNome(){
		return nome;
	}
	
	String retornaTelefone(){
		return telefone;
	}
	
	String retornaMatricula(){
		return matricula;
	}

}
