package br.com.players;

public class Player {
	
	String nome;
	int diaNasc;
	int mesNasc;
	int anoNasc;
	String popId;
	String categoria;
	Endereco endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDiaNasc() {
		return diaNasc;
	}
	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}
	public int getMesNasc() {
		return mesNasc;
	}
	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public String getPopId() {
		return popId;
	}
	public void setPopId(String popId) {
		this.popId = popId;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
