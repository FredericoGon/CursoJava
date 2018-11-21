package br.com.javacurso;

import java.util.ArrayList;

public class Server {
	
	int idcontrol = 1;
	private ArrayList<Modelo> personagens = new ArrayList<>();

	public boolean cadastrarPersonagem(Modelo modelo) {
		boolean resultado = false;
		if (modelo != null) {
			modelo.setId(idcontrol++);
			personagens.add(modelo);
			resultado = true;
		}
		return resultado;
	}

	public ArrayList<Modelo> listarPersonagens() {
		return personagens;
	}

	public boolean remover(int remocao) {
		// TODO Auto-generated method stub
		return false;
	}

}
