package br.com.cursojava;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private boolean promo;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setPreco(double preco){
		if(preco >= 0.01){
			this.preco = preco;
		}else{
			System.out.println("Deu ruim irmăo!");
		}	
	}
	
	public String getNome(){
		return nome;
	}
	
	public double getpreco(){
		return preco;
	}

	public boolean isPromo() {
		return promo;
	}

	public void setPromo(boolean promo) {
		this.promo = promo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
