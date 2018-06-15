package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import Negocio.Bebida;
import Persistencia.Conexao;

public class BebidaDAO {
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
