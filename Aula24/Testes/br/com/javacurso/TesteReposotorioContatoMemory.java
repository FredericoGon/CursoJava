package br.com.javacurso;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteReposotorioContatoMemory {
	
	private RepositorioContatoMemory repos;
	
	@Before
	public void AntesDeCadaTest(){
		repos = new RepositorioContatoMemory();
	}
	
	@Test
	public void testarAdicionar(){
		boolean resultado = repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		Assert.assertEquals(true, resultado);
	}
	
	@Test
	public void testarAdicionarNull(){
		boolean resultado = repos.adicionar(null);
		Assert.assertEquals(false, resultado);
	}

	
	@Test
	public void testarEditar2(){
		repos.adicionar(new Contato(1, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(2, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		Contato john = repos.buscarPorId(1);
		john.setEmail("homer@gmail.com");
		repos.editar(john);
		Contato johncorrigido = repos.buscarPorId(1);
		boolean resultado = johncorrigido.getEmail().equals("homer@gmail.com");
		Assert.assertEquals(true, resultado);
	}
	
	@Test
	public void testarEditar3(){
		repos.adicionar(new Contato(1, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(2, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		Contato john = repos.buscarPorId(1);
		john.setEmail("homer@gmail.com");
		repos.editar(john);
		Contato johncorrigido = repos.buscarPorId(1);
		boolean resultado = johncorrigido.getEmail().equals("batta");
		Assert.assertEquals(false, resultado);
	}
	
	@Test
	public void testarEditar4(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		Contato john = null;
		boolean resultado = repos.editar(john);		
		Assert.assertEquals(false, resultado);
	}
	
	@Test
	public void testerBuscarTodos(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		int resultado = repos.buscarTodos().size();
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void testeBuscarPorNome2(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(null, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(null, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		int resultado = repos.buscarPorNome("Homer").size();
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void testeBuscarPorNome1(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(null, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(null, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		int resultado = repos.buscarPorNome("Fred").size();
		Assert.assertEquals(1, resultado);
	}
	
	@Test
	public void testeBuscarPorTelefone2(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "99663322", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(null, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(null, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		int resultado = repos.buscarPorTelefone("99663322").size();
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void testeBuscarPorTelefone1(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(null, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(null, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		int resultado = repos.buscarPorTelefone("77445588").size();
		Assert.assertEquals(1, resultado);
	}
	
	@Test
	public void testeBuscarPorTipo2(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "99663322", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(null, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(null, "Homer", "homerbart@gmai.com", "77445588", TipoContato.FAMILIA));
		int resultado = repos.buscarPorTipo(TipoContato.FAMILIA).size();
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void testeBuscarPorTipo1(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(null, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(null, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		int resultado = repos.buscarPorTipo(TipoContato.AMIGO).size();
		Assert.assertEquals(1, resultado);
	}
	
	@Test
	public void testeBucaId(){
		repos.adicionar(new Contato(1, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(2, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(3, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(4, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		Contato john = repos.buscarPorId(2);
		int resultado = john.getId();
		Assert.assertEquals(2, resultado);
	}
	
	@Test
	public void testeRemover(){
		repos.adicionar(new Contato(1, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(2, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(3, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(4, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		Contato john = repos.buscarPorId(2);
		boolean resultado = repos.remover(john);
		Assert.assertEquals(true, resultado);
	}
	
	@Test
	public void testeRemover2(){
		repos.adicionar(new Contato(1, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(2, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(3, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(4, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		Contato john = repos.buscarPorId(2);
		repos.remover(john);
		int resultado = repos.buscarTodos().size();
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void testeRemover3(){
		repos.adicionar(new Contato(null, "Fred", "fredericogon@gmai.com", "33236233", TipoContato.AMIGO));
		repos.adicionar(new Contato(null, "Homer", "homer@gmai.com", "11223366", TipoContato.FAMILIA));
		repos.adicionar(new Contato(null, "Bart", "bart@gmai.com", "99663322", TipoContato.TRABALHO));
		repos.adicionar(new Contato(null, "Homer", "homerbart@gmai.com", "77445588", TipoContato.OUTROS));
		Contato john = null;
		repos.remover(john);
		int resultado = repos.buscarTodos().size();
		Assert.assertEquals(4, resultado);
	}


}
