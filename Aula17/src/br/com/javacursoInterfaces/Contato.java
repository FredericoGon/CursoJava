package br.com.javacursoInterfaces;

public class Contato implements Comparable<Contato>{
	
	private String nome;
	private String email;
	
	public Contato(){
		super();
	}
	
	public Contato(String nome){
		this();
		this.nome = nome;
		
	}
	
	public Contato(String nome, String email){
		this(nome);
		this.email = email;
		
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + "]";
	}

	/*
	@Override
	public int compareTo(Contato o) {
		if(nome != null){
			return nome.compareTo(o.nome);
		}else if(o == null || o.nome == null){
			return 0;
		}else{
			return 1;
		}
	}//compareTo
	*/
	/*
	@Override
	public int compareTo(Contato o) {
		if(nome.length() > o.nome.length()){
			return -1;
		}else if(o == null || o.nome == null){
			return 0;
		}else{
			return 1;
		}
	}//compareTo
	*/
	public int compareTo(Contato o) {
		if(nome != null){
			if(o != null && o.nome != null){
				int compare = Integer.compare(nome.length(), o.nome.length());
				if(compare == 0){
					compare = nome.compareTo(o.nome);
					if (compare == 0){
						compare = Integer.compare(email.length(), o.email.length());
						if (compare == 0){
							compare = email.compareTo(o.email);
						}
					}
				}
				return compare;
			}else{
				return -1;
			}
		}else if(o == null || o.nome == null){
			return 0;
		}else{
			return 1;
		}
	}//compareTo



}//class
