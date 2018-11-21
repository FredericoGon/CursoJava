package br.com.javacurso.prime;

import java.util.List;

public class GinastaFacade {
	
	private RepositorioGinasta repos = new RepositorioGinasta();
	
	public List<Ginasta> carregarGinastas() {
		return repos.buscarTodos();
	}

	public Ginasta carregarGinasta(Integer id) {
		return repos.buscarPorId(id);
	}

	public Ginasta novoGinasta() {
		return new Ginasta();
	}

	public boolean salvar(Ginasta ginastaAtual) {
		return repos.salvar(ginastaAtual);
	}

	public boolean removerGinasta(Ginasta ginastaAtual) {
		return repos.remover(ginastaAtual.getId());
	}

}
