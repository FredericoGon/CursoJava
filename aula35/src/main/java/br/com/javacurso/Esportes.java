package br.com.javacurso;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "esportes")
public class Esportes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Integer atletas;
	
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name = "campeao_id", nullable = false)
	private Campeoes campeao_id;

	public Esportes() {
		super();
	}
	

	public Esportes(Integer id, String nome, Integer atletas, Campeoes campeao_id) {
		super();
		this.id = id;
		this.nome = nome;
		this.atletas = atletas;
		this.campeao_id = campeao_id;
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

	public Integer getAtletas() {
		return atletas;
	}

	public void setAtletas(Integer atletas) {
		this.atletas = atletas;
	}
	
	public Campeoes getCampeao_id() {
		return campeao_id;
	}


	public void setCampeao_id(Campeoes campeao_id) {
		this.campeao_id = campeao_id;
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
		Esportes other = (Esportes) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Esportes [id=" + id + ", nome=" + nome + ", atletas=" + atletas + ", campeao_id=" + campeao_id + "]";
	}
	
	
}
