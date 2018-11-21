package br.com.cursojava;

public class Produto {
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
			System.out.println("Deu ruim irmão!");
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

}
