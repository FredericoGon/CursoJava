package br.com.javacurso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoUtils {
	
	private static final String USER = "postgres";
	private static final String PASSWORD = "admin";
	private static final String URL = "jdbc:postgresql://localhost:5432/curso";
	private static Connection connection;
	
	static{ //não necessário, somente para sabermos se for ncessário no caso de uso de java muito antigo
		try{
			Class.forName("org.postgresql.Driver"); // força o carregamento da classe
		} catch (ClassNotFoundException e){
			System.out.println("Não foi possível carregar o driver.");
		}
		
	}//static
	
	public static Connection getConnection() throws SQLException{
		if(connection == null || connection.isClosed()){
			try {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e){
				System.out.println("Não foi possível");
				throw e;
			}
		}
		return connection;
	}//getConnection


	public static void main(String[] args) throws SQLException{
		Connection con = getConnection();
		if(con != null){
			System.out.println("test com sucesso");
			con.close();
		} else{
			System.out.println("Não foi possível realizar a conexão.");
		}
	}//main
}//class
