package br.com.javacurso.prime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class RepositorioGinasta {
	
	private List<Ginasta> lista = new ArrayList<>();
	private static int contador = 1;
	
	public List<Ginasta> buscarTodos(){
		return Collections.unmodifiableList(lista);
	}
	
	public Ginasta buscarPorId(Integer id){
		Optional<Ginasta> first = lista
		.stream()
		.filter(ginasta -> id!=null && id.equals(ginasta.getId()))
		.findFirst();
		
		return first.isPresent() ? first.get() : null;
	}
	
	public boolean salvar(Ginasta ginasta){
		boolean resultado = false;
		if(ginasta.getId() == null){
			return inserir(ginasta);
		}else{
			resultado = atualizar(ginasta);
		}
		return resultado;
	}

	private boolean inserir(Ginasta ginasta) {
		ginasta.setId(contador++);
		return lista.add(ginasta);
	}

	private boolean atualizar(Ginasta ginasta) {
		boolean resultado = false;
		int indexOf = lista.indexOf(ginasta);
		if(indexOf > -1){
			lista.set(indexOf, ginasta);
			resultado = true;
		}
		return resultado;
	}
	
	public boolean remover(Integer id){
		int maior = lista.size();
		lista = lista
				.stream()
				.filter(contato -> id!=null && !id.equals(contato.getId()))
				.collect(Collectors.toList());
		return maior > lista.size();
	}

}
