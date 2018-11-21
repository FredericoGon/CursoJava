package br.com.players;

import java.util.ArrayList;

public class Server {
	
	ArrayList<Player> players = new ArrayList<>();

	public boolean cadastrarPlayer(Player player) {
		boolean resultado = players.add(player);
		return resultado;
	}

	public ArrayList<Player> listarPlayers() {
		return players;
	}

	public ArrayList<Player> pesquisaPop(String pesquisa) {
		ArrayList<Player> filtradaPop = new ArrayList<>();
		Player atual = null;
		for (int i =0;i<players.size();i++) {
			atual = players.get(i);
			if(atual.getPopId().equals(pesquisa)) {
				filtradaPop.add(atual);
			}
		}
		return filtradaPop;
	}

	public boolean excluir(String remocao) {
		Player atual = null;
		boolean resultado = false;
		for (int i = 0; i<players.size();i++) {
			atual = players.get(i);
			if(atual.getPopId().equals(remocao)) {
				players.remove(i);
				resultado = true;
			}
		}
		return resultado;
	}

}//class
