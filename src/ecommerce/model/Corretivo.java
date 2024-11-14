package ecommerce.model;

public class Corretivo extends Produto {
	
	private String cor;
	
	public Corretivo (int numero, String produto, float valor, String cor) {
		super(numero, produto,valor);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}	
	
	@Override
	public void visualizar() {
		super.visualizar();
		
		System.out.println("Tonalidade do corretivo: " + cor);

	  }
	}
