package br.com.cursojava.introducao;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorldBean")
@SessionScoped
public class HelloWorldBean {
	
	private String nome;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM//yyyy HH:mm:ss");

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataHora(){
		return sdf.format(new Date());
	}
	
	public String salvar(){
		if(this.nome != null && this.nome.length() >= 3){
			return "result";
		}else{
				return null;
			}
	}

}
