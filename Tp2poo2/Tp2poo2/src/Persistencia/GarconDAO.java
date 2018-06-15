package Persistencia;
/*
 * Classe GarconDAO abstrai acesso dos dados da Classe Garcon, lê e grava a partir da origem de dados
 * Encapsula o acesso aos dados, de forma que as demais classes não precisam saber sobre isso
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import Negocio.Bebida;
import Negocio.Garcon;

public class GarconDAO {
	
	/*
	 * Lista todos os Garçons cadastradas
	 */
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
