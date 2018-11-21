package br.com.javacurso;

public class Funcionario extends Object{
	
	private String codigo;
	private String nome;
	private double salarioBase;
	
	public Funcionario(){
		super();
	}
	
	
	
	public Funcionario(String codigo, String nome, double salarioBase) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.salarioBase = salarioBase;
		System.out.println("construtor");
	}



	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double salarioLiquido(){
		double salario =  getSalarioBase() *(1-0.11);
		return salario;
	}//salarioLiquido
}//class
