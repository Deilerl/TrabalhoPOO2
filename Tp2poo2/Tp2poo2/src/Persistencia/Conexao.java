package Persistencia;
/*
 * Realiza conexão com o banco de dados
 */
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
// dados de acesso ao banco
public class Conexao {
	private String bd;
	private String host;
	private String user;
	private String pwd;
	// configurações para acessar o banco de dados, alterar em caso de acesso a banco remotos ou com outras configuração.
	public Conexao() {
		this.bd = "Restaurante";
		this.host = "127.0.0.1";
		this.user = "root";
		this.pwd = "root";
	}
	/*
	 * realiza a conexão com o banco de dados
	 */
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://" + this.host + "/" + this.bd;
		return (Connection) DriverManager.getConnection(url, this.user, this.pwd);
	}

	public Connection getConexao() throws SQLException {
		String url = "jdbc:mysql://" + this.host + "/" + this.bd;
		return (Connection) DriverManager.getConnection(url, this.user, this.pwd);
	}
}
