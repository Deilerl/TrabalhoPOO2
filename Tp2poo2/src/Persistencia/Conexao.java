package Persistencia;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Conexao {
	private String bd;
	private String host;
	private String user;
	private String pwd;
	
	public Conexao() {
		this.bd = "Restaurante";
		this.host = "127.0.0.1";
		this.user = "root";
		this.pwd = "root";
	}
	
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://" + this.host + "/" + this.bd;
		return (Connection) DriverManager.getConnection(url, this.user, this.pwd);
	}

	public Connection getConexao() throws SQLException {
		String url = "jdbc:mysql://" + this.host + "/" + this.bd;
		return (Connection) DriverManager.getConnection(url, this.user, this.pwd);
	}
}
