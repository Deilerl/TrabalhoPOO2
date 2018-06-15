package Negocio;

/* Atributos das bebidas, id, nome e preço
 * inicia a classe bebida.
 * */
public class Bebida {
	private int id;
	private String nome;
	private float preco;
	/*
	 * gets and sets
	 * */
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
}
