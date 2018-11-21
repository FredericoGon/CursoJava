package br.com.javacurso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lanches")
public class Lanche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Double preco;
	
	@Column(nullable = false)
	private Boolean vegan;
	public Lanche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lanche(Integer id, String nome, Double preco, Boolean vegan) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.vegan = vegan;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Boolean getVegan() {
		return vegan;
	}
	public void setVegan(Boolean vegan) {
		this.vegan = vegan;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lanche other = (Lanche) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Lanche [id=" + id + ", nome=" + nome + ", preco=" + preco + ", vegan=" + vegan + "]";
	}
	
	
	
}
