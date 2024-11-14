package ecommerce;

import java.util.Scanner;

import ecommerce.model.Produto;
import ecommerce.model.Corretivo;
import ecommerce.model.Base;

public class Menu {

	public static void main(String[] args) {
		
		int opcao;

		while (true) {
			
			System.out.println("                                                     ");
			System.out.println("               | ------------- |                     ");
			System.out.println("               | MAGIC BEAUTY  |                     ");
			System.out.println("               | ------------- |                     ");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto por número            ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Digite a opção desejada:                             ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\nDescubra o poder da sua beleza com Magic Beauty!");
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Adicionar produto\n\n");

					break;
				case 2:
					System.out.println("Listar todos os produtos\n\n");

					break;
				case 3:
					System.out.println("Buscar produto porID\n\n");

					break;
				case 4:
					System.out.println("Atualizar produto\n\n");

					break;
				case 5:
					System.out.println("Apagar produto\n\n");

					break;
				case 6:
					System.out.println("Sair");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
}