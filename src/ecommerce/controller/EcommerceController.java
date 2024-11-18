package ecommerce.controller;

import ecommerce.model.Loja;
import java.util.ArrayList;
import ecommerce.repository.EcommerceRepository;
	
public class EcommerceController implements EcommerceRepository {

	private ArrayList<Loja> listaTodos = new ArrayList<Loja> ();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var loja = buscarNaCollection(numero);
		
		if (loja != null)
			loja.visualizar();
		else
			System.out.println("\nO produto número: " + numero + " não foi encontrado!");
	}

	@Override
	public void listarTodos() {
		for (var loja : listaTodos) {
			loja.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Loja loja) {
		listaTodos.add(loja);
		System.out.println("\nA conta número: " + loja.getNumero() + " foi criada com sucesso!");
	}

	@Override
	public void atualizar(Loja loja) {
		var buscaLoja = buscarNaCollection(loja.getNumero());
		
		if (buscaLoja != null) {
			listaTodos.set(listaTodos.indexOf(buscaLoja), loja);
			System.out.println("\n Produto número: " + loja.getNumero() + " foi atualizado com sucesso!");
		} else
			System.out.println("\n Produto número: " + loja.getNumero() + " não foi encontrado!");
		}
		

	@Override
	public void deletar(int numero) {
		var loja = buscarNaCollection(numero);
		
		if (loja != null) {
			if (listaTodos.remove(loja) == true)
				System.out.println("\nProduto número: " + numero + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto número: " + numero + " não foi encontrado!");
		}
	
public int gerarNumero() {
	return ++ numero;
}
public Loja buscarNaCollection(int numero) {
    for (Loja loja : listaTodos) { 
        if (loja.getNumero() == numero) {
            return loja;
        }
    }
    return null; 
}


}
