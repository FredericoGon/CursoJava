package br.com.cursojava.contatos;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("produtos")
public class ControllerProduto {
	
	private RepositorioProduto repos = new RepositorioProduto();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Produto> getProdutos(){
		return repos.buscarTodos();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarProdutoPorId(@PathParam("id") Integer id){
		Produto produto = repos.buscarPorId(id);
		if(produto != null){
			return Response.ok(produto).build();
		}else{
			return Response.status(Status.NOT_FOUND).build();
		}

	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserir(Produto produto){
		if(produto != null && produto.getId() == null){
			boolean result = repos.salvar(produto);
			if (result){
				return Response.status(Status.CREATED).entity(produto).build();
			}
		}
		return Response.status(Status.NOT_ACCEPTABLE).build();
	}
	
	@Path("/{id}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response atualizar(@PathParam("id") Integer id, Produto produto){
		Produto produtoNaBase = repos.buscarPorId(id);
		if(produtoNaBase != null){
			produto.setId(id);
			repos.salvar(produto);
			return Response.status(Status.ACCEPTED).entity(produto).build();
		}else{
			return Response.status(Status.NOT_ACCEPTABLE).build();
		}
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response remover(@PathParam("id") Integer id){
		if(repos.remover(id)){
			return Response.status(Status.ACCEPTED).build();
		}else{
			return Response.status(Status.NOT_ACCEPTABLE).build();
		}

	}

}
