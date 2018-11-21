package br.com.javacurso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioContatoMemory implements RepositorioContato{
	
	
	private List<Contato> contatos = new ArrayList<>();
	private static int count = 1;

	@Override
	public boolean adicionar(Contato contato) {
		boolean resultado = false;
		if(contato != null){
			//contato.setId(count++);
			resultado = contatos.add(contato);
		}
		return resultado;
	}

	@Override
	public boolean editar(Contato contato) {
		boolean resultado = false;
		if(contato != null){
			contatos.set(contato.getId(), contato);
			resultado = true;
		}
		return resultado;
	}

	@Override
	public List<Contato> buscarTodos() {
		return contatos;
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {
		List<Contato> contatosPorNome = contatos
				.stream()
				.filter((Contato contato)->{
					return contato.getNome().equals(nome);
					})
				.collect(Collectors.toList());
		return contatosPorNome;
	}

	@Override
	public List<Contato> buscarPorTelefone(String telefone) {
		List<Contato> contatosPorTelefone = contatos
				.stream()
				.filter((Contato contato)->{
					return contato.getTelefone().equals(telefone);
					})
				.collect(Collectors.toList());
		return contatosPorTelefone;
	}

	@Override
	public List<Contato> buscarPorTipo(TipoContato tipo) {
		List<Contato> contatosPorTipo = contatos
				.stream()
				.filter((Contato contato)->{
					return contato.getTipo().equals(tipo);
					})
				.collect(Collectors.toList());
		return contatosPorTipo;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		Contato resultado = null;
		for (int i = 0;i<contatos.size();i++){
			if (contatos.get(i).getId()==id){
				resultado = contatos.get(i);
			}
		}
		return resultado;
	}

	@Override
	public boolean remover(Contato contato) {
		boolean resultado = false;
		if(contato != null){
			if (contatos.remove(contato)){
				resultado = true;
			}
		}
		return resultado;
	}
}
