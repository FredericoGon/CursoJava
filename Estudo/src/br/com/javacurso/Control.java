package br.com.javacurso;

import java.util.ArrayList;

public class Control {
	
	Server repositorio = new Server();

	public boolean cadastrarPersonagem(String nome, String job, int attack, double rate) {
		Modelo modelo = new Modelo();
		modelo.setNome(nome);
		modelo.setJob(job);
		modelo.setAttack(attack);
		modelo.setRate(rate);
		return repositorio.cadastrarPersonagem(modelo);
	}

	public ArrayList<Modelo> listarPersonagens() {
		return repositorio.listarPersonagens();
	}

	public boolean remover(int remocao) {
		return repositorio.remover(remocao);
	}

}
