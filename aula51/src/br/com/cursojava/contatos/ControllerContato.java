package br.com.cursojava.contatos;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("contatos")
public class ControllerContato {
	
	private RepositorioContato repos = new RepositorioContato();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contato> getContatos(){
		return repos.buscarTodos();
	}

}
