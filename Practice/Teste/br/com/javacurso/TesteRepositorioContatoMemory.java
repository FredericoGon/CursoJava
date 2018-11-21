package br.com.javacurso;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteRepositorioContatoMemory {
	
	RepositorioContatoMemory reposit;
	
	@Before
	public void antes(){
		reposit = new RepositorioContatoMemory();
	}
	
	@Test
	public void testarAdicionar01() {
		boolean resultado = reposit.adicionar(new Contato(null, "Abel", "abel@abel.com", "33221144", TipoContato.AMIGO));
		Assert.assertEquals(true, resultado);
	}
	
	@Test
	public void testarAdicionarNull() {
		boolean resultado = reposit.adicionar(null);
		Assert.assertEquals(false, resultado);
	}
	
	@Test
	public void testarAdicionarId() {
		reposit.adicionar(new Contato(null, "Abel", "abel@abel.com", "33221144", TipoContato.AMIGO));
		reposit.adicionar(new Contato(null, "Beto", "beto@beto.com", "77889966", TipoContato.FAMILIA));
		boolean resultado = false;
		List<Contato> lista = reposit.buscarTodos();
		for (int i = 0;i<lista.size();i++) {
			if (lista.get(i).getId()==null);
			resultado = true;
		}
		Assert.assertEquals(true, resultado);
	}
	
	@Test
	public void testarEditar01() {
		reposit.adicionar(new Contato(null, "Abel", "abel@abel.com", "33221144", TipoContato.AMIGO));
		reposit.adicionar(new Contato(null, "Beto", "beto@beto.com", "77889966", TipoContato.FAMILIA));
		List<Contato> lista = reposit.buscarTodos();
		lista.get(1).setNome("Abelardo");
		reposit.editar(lista.get(2));
		String resultado = lista.get(1).getNome();
		Assert.assertEquals("Abelardo", resultado);
	}

}
