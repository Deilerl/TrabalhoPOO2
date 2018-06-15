package Persistencia;
/**
 * Realiza conexão com o banco de dados
 * @autor (Deiler Luís)
 */
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
/** 
 * Dados de acesso ao banco
 * @author Deiler
 *
 */
public class Conexao {
	private String bd;
	private String host;
	private String user;
	private String pwd;
	/** Configurações para acessar o banco de dados, alterar em caso de acesso a banco 
	 *  remotos ou com outras configuração.
	 *  @autor (Deiler Luís)
	 **/
	public Conexao() {
		this.bd = "Restaurante";
		this.host = "127.0.0.1";
		this.user = "root";
		this.pwd = "root";
	}
	/**
	 * realiza a conexão com o banco de dados
	 * @autor (Deiler Luís)
	 * */
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://" + this.host + "/" + this.bd;
		return (Connection) DriverManager.getConnection(url, this.user, this.pwd);
	}

	public Connection getConexao() throws SQLException {
		String url = "jdbc:mysql://" + this.host + "/" + this.bd;
		return (Connection) DriverManager.getConnection(url, this.user, this.pwd);
	}
}
