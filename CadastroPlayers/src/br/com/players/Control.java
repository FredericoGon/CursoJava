package br.com.players;

import java.util.ArrayList;

public class Control {
	
	Server repositorio = new Server();

	public boolean validacaoString(String qualquer) {
		boolean resultado = qualquer != null && !"".equals(qualquer.trim()) && qualquer.length()>=3;
		return resultado;
	}

	public boolean validacaoInt(int qualquer) {
		boolean resultado = qualquer != 0;
		return resultado;
	}

	public boolean validacaoDia(int diaNasc) {
		boolean resultado = diaNasc <= 31 && diaNasc > 0;
		return resultado;
	}

	public boolean validacaoMes(int mesNasc) {
		boolean resultado = mesNasc <= 12 && mesNasc > 0;
		return resultado;
	}

	public boolean validacaoAno(int anoNasc) {
		boolean resultado = anoNasc >= 1900 && anoNasc < 2016;
		if (!resultado) {
			System.out.println("O jogador deve ter mais de 3 anos de idade!");
		}else {
			if (anoNasc > 2003 && anoNasc < 2009 ) {
				System.out.println("O jogador é da categoria Sênior.");
			}else if(anoNasc >2009) {
				System.out.println("O jogador é da categoria Júnior.");
			}else {
				System.out.println("O jogador é da categoria Master.");
			}
		}
		return resultado;
	}

	public boolean cadastrarPlayer(String nome, int diaNasc, int mesNasc, int anoNasc, String popId,
			String rua, int numero, String complemento, String bairro, String cidade, String estado) {
		Endereco endereco = new Endereco();
		Player player = new Player();
		String categoria = "";
		player.setNome(nome);
		player.setDiaNasc(diaNasc);
		player.setMesNasc(mesNasc);
		player.setAnoNasc(anoNasc);
		if (anoNasc > 2003 && anoNasc < 2009 ) {
			categoria = "Sênior";
		}else if(anoNasc >2009) {
			categoria = "Júnior";
		}else {
			categoria = "Master";
		}
		player.setPopId(popId);
		player.setCategoria(categoria);
		endereco.setRua(rua);
		endereco.setNumero(numero);
		endereco.setComplemento(complemento);
		endereco.setBairro(bairro);
		endereco.setCidade(cidade);
		endereco.setEstado(estado);
		player.setEndereco(endereco);
		boolean resultado = repositorio.cadastrarPlayer(player);
		return resultado;
	}

	public ArrayList<Player> listarPlayers() {
		ArrayList<Player> lista = new ArrayList<>();
		lista = repositorio.listarPlayers();
		return lista;
	}

	public ArrayList<Player> pesquisaPop(String pesquisa) {
		ArrayList<Player> lista = new ArrayList<>();
		lista = repositorio.pesquisaPop(pesquisa);
		return lista;
	}

	public boolean excluir(String remocao) {
		boolean resultado = repositorio.excluir(remocao);
		return resultado;
	}
	

}
