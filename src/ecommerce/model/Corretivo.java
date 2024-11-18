package ecommerce.model;

public class Corretivo extends Loja {
	
	private String cor;

	public Corretivo(int numero, int codigo, int tipo, String marca, float preco, String cor) {
		super(numero, codigo, tipo, marca, preco);
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
			System.out.println("Tonalidade: " + this.cor);	
	  }
}