package Persistencia;
/*
 * Classe BebidaDAO abstrai acesso dos dados da Classe bebidas, l� e grava a partir da origem de dados
 * Encapsula o acesso aos dados, de forma que as demais classes n�o precisam saber sobre isso
 * @autor (Deiler Lu�s)
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import Negocio.Bebida;
import Persistencia.Conexao;

public class BebidaDAO {
	/*
	 * Lista todos as bebidas cadastradas
	 * @autor (Deiler Lu�s)
	 */
	public ArrayList<Bebida> listarTodos() throws SQLException{
		Connection con = new Conexao().getConnection();
		
		String select = "select * from bebida";
		ResultSet rs = con.prepareStatement(select).executeQuery();
		
		ArrayList<Bebida> listaBebidas = new ArrayList<Bebida>();
		Bebida b;
		while(rs.next()) {
			b = new Bebida();
			b.setId(rs.getInt("id"));
			b.setNome(rs.getString("nome"));
			b.setPreco(rs.getFloat("preco"));
			listaBebidas.add(b);
		}
		con.close();
		return listaBebidas;
	}
}
