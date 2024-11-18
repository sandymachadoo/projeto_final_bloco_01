package ecommerce.model;

public abstract class Loja {
	
	private int numero;
	private int codigo;
	private int tipo;
	private String marca;
	private float preco;
	
	public Loja(int numero, int codigo, int tipo, String marca, float preco) {
		this.numero = numero;
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int agencia) {
		this.codigo = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Base";
			break;
		case 2:
			tipo = "Corretivo";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("***********************************************************");
		System.out.println("Numero da produto: " + this.numero);
		System.out.println("Código: " + this.codigo);
		System.out.println("Tipo do produto: " + tipo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Valor: " + this.preco);

	}
}
