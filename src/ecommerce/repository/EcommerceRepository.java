package ecommerce.repository;

import ecommerce.model.Loja;

public interface EcommerceRepository {
	
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void cadastrar(Loja loja);
	public void atualizar(Loja loja);
	public void deletar (int numero);
}
