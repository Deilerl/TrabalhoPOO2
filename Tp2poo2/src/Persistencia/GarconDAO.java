package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import Negocio.Bebida;
import Negocio.Garcon;

public class GarconDAO {
	public ArrayList<Bebida> listarTodos() throws SQLException{
		Connection conexao = (Connection) new Conexao() .getConexao();
		ResultSet result = conexao.prepareStatement("select * from garcon order by nome").executeQuery();
		
		ArrayList<Bebida> array = new ArrayList<Bebida>();
		Garcon garcon;
		while (result.next()){
			garcon= new Garcon();
			garcon.setId(result.getInt("id"));
			garcon.setNome(result.getString("nome"));		
		}
		conexao.close();
		return array;
	}
}
