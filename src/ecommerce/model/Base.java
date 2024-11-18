package ecommerce.model;

public class Base extends Loja {
	
	private String tonalidade;

	public Base(int numero, int codigo, int tipo, String marca, float preco, String tonalidade) {
		super(numero, codigo, tipo, marca, preco);
		this.tonalidade = tonalidade;
		
	}

	public String getTonalidade() {
		return tonalidade;
	}

	public void setTonalidade(String tonalidade) {
		this.tonalidade = tonalidade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tonalidade: " + this.tonalidade);
	}
}
