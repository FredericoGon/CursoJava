package br.com.javacurso;

public interface RepositorioContato {
	
	boolean adicionar(Contato contato);
	boolean editar(Contato contato);
	java.util.List<Contato> buscarTodos();
	java.util.List<Contato> buscarPorNome (String nome);
	java.util.List<Contato> buscarPorTelefone (String telefone);
	java.util.List<Contato> buscarPorTipo (TipoContato tipo);
	Contato buscarPorId(Integer id);
	boolean remover(Contato contato);

}
