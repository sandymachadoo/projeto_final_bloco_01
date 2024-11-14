package ecommerce.model;

public abstract class Produto {
	
	private int numero;
	private String produto;
	private float valor;


	public Produto(int numero, String produto, float valor) {
		this.numero = numero;
		this.produto = produto;
		this.valor = valor;
		
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setDescricao(String produto) {
		this.produto = produto;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor (float valor) {
		this.valor = valor;
	}

	public void visualizar() {
		System.out.println("\n**************************");
		System.out.println("Produto: " + produto);
		System.out.println("ID: " + numero);
		System.out.println("Valor: R$" + valor);
		System.out.println("\n**************************");
	}
}