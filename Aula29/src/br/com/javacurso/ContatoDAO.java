package br.com.javacurso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO implements RepositorioContato{

	@Override
	public List<Contato> buscarTodos() {
		List<Contato> contatos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()){
				contatos.add(carregarContato(cursor));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista");
		}
		return contatos;
	}

	private Contato carregarContato(ResultSet cursor) throws SQLException{
		Integer id = cursor.getInt("id");
		String nome = cursor.getString("nome");
		String email = cursor.getString("email");
		String telefone = cursor.getString("telefone");
		return new Contato(id, nome, email, telefone);
	}

	@Override
	public List<Contato> buscarPorNome(String nome) {
		List<Contato> contatos = new ArrayList<>();
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select * from contatos where upper(nome) like ? ");// where ? like "%nome%"
			comando.setString(1, "%"+nome+"%");
			ResultSet cursor = comando.executeQuery();
			while(cursor.next()){
				contatos.add(carregarContato(cursor));
			}
			cursor.close();
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível carregar a lista");
		}
		return contatos;
	}

	@Override
	public Contato buscarPorTelefone(String telefone) {
		Contato contato = null;
		if(telefone != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where telefone = ?");
				comando.setString(1, telefone);
				ResultSet cursor = comando.executeQuery();
				if(cursor.next()){
					contato = carregarContato(cursor);
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possível carregar o contato solicitado.");
			}
		}
		return contato;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		Contato contato = null;
		if(id != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("select * from contatos where id = ?");
				comando.setInt(1, id); //o número 1 é o índice do ?, inicia em 1
				ResultSet cursor = comando.executeQuery();
				if(cursor.next()){
					contato = carregarContato(cursor);
				}
				cursor.close();
				comando.close();
			} catch (Exception e) {
				System.out.println("Não foi possível carregar o contato solicitado.");
			}
		}
		return contato;
	}

	@Override
	public void inserir(Contato contato) {
		if(contato != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando =  conexao.prepareStatement("insert into contatos(nome, email, telefone) values(?, ?, ?)", 
						                                              Statement.RETURN_GENERATED_KEYS);
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.execute();
				ResultSet cursor = comando.getGeneratedKeys();
				if(cursor.next()){
					Integer id = cursor.getInt("id");
					contato.setId(id);
				}
				cursor.close();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível inserir os dados.");
			}
		}
		
	}

	@Override
	public void atualizar(Contato contato) {
		if(contato != null && contato.getId() != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("update contatos set nome = ?, email = ?, telefone = ? where id = ?");
				comando.setString(1, contato.getNome());
				comando.setString(2, contato.getEmail());
				comando.setString(3, contato.getTelefone());
				comando.setInt(4, contato.getId());
				comando.executeUpdate();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível alterar o contato.");
			}
			
		}
		
	}

	@Override
	public void remover(Integer id) {
		if(id != null){
			try {
				Connection conexao = BancoUtils.getConnection();
				PreparedStatement comando = conexao.prepareStatement("delete from contatos where id = ?");
				comando.setInt(1, id);
				comando.execute();
				comando.close();
			} catch (SQLException e) {
				System.out.println("Não foi possível remover o contato.");
			}
		}
		
	}

	@Override
	public int contar() {
		Integer resultado = 0;
		try {
			Connection conexao = BancoUtils.getConnection();
			PreparedStatement comando = conexao.prepareStatement("select count(*) as quantidade from contatos");
			ResultSet cursor = comando.executeQuery();
			if(cursor.next()){
				resultado = cursor.getInt("quantidade");
			}
			comando.close();
		} catch (SQLException e) {
			System.out.println("Não foi possível contar.");
		}
		return resultado;
	}

}
