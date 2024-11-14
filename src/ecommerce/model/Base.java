package ecommerce.model;

public class Base extends Produto {
	
	private String cor;
	
	public Base (int numero, String produto, float valor, String cor) {
		super(numero, produto,valor);
		this.cor = cor;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCorTinta(String cor) {
		this.cor = cor;
	}	
	
	@Override
	public void visualizar() {
		super.visualizar();
			
		System.out.println("Tonalidade da base: " + cor);
		
	}
}