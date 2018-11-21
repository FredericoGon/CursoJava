package br.com.javacurso;

import java.util.ArrayList;
import java.util.List;

public class RepositorioContatoMemory implements RepositorioContato{
	
	List<Contato> lista = new ArrayList<>();
	static int contagem = 1;

	@Override
	public boolean adicionar(Contato contato) {
		boolean resultado = false;
		if(contato != null) {
			contato.setId(contagem++);
			resultado = lista.add(contato);
		}
		return resultado;
	}

	@Override
	public boolean editar(Contato contato) {
		boolean resultado = false;
		if(contato != null) {
			lista.set(contato.getId(), contato);
			resultado = true;
		}
		return resultado;
	}

	@Override
	public List<Contato> buscarTodos() {
		return lista;
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> buscarPorTelefone(String telefone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> buscarPorTipo(TipoContato tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remover(Contato contato) {
		// TODO Auto-generated method stub
		return false;
	}

}
