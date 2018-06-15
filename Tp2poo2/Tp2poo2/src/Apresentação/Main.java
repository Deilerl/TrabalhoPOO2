package Apresentação;

import java.sql.SQLException;

import Negocio.Bebida;
import Persistencia.BebidaDAO;

public class Main {

	public static void main(String[] args) throws SQLException {
BebidaDAO dao = new BebidaDAO();
		
		for (Bebida b : dao.listarTodos()) {
			System.out.println("Id: " + b.getId() + " " + "Nome: " + b.getNome() + " " + b.getPreco());
		}

	}

}
