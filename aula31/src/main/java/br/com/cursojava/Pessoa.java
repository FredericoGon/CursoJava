package br.com.cursojava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // representa uma tabela
@Table(name="pessoas") // para reconhecer o nome da tabela, pois a classe pode estar em nome diferente da tabela
public class Pessoa {
	
	@Id // indica que esta é a chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // para identificar que é gerada automaticamente, strategy é como é gerada, nesse caso é o serial
	private Integer id;
	
	@Column(nullable = false, length = 200) // indica que é um coluna na tabela (dentro dos parenteses coloca os parametros da coluna na tabela)
	private String nome;
	public Pessoa() {
		super();
	}
	public Pessoa(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
		Pessoa other = (Pessoa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
	
	

}
