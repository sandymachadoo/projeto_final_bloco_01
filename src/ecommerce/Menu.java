package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;

import ecommerce.util.Cores;
import java.util.Scanner;
import ecommerce.model.Loja;
import ecommerce.controller.EcommerceController;
import ecommerce.model.Base;
import ecommerce.model.Corretivo;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
    	EcommerceController loja = new EcommerceController();
 
    	int opcao, numero, codigo, tipo;
    	String marca, tonalidade, cor;
    	float preco;
    	       
   
		while(true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND
			          +"                                                     ");
	System.out.println("                                                     ");
	System.out.println("               | ------------- |                     ");
	System.out.println("               | MAGIC BEAUTY  |                     ");
	System.out.println("               | ------------- |                     ");
	System.out.println("                                                     ");
	System.out.println("            1 - Cadastrar produto                    ");
	System.out.println("            2 - Listar todos os produtos             ");
	System.out.println("            3 - Buscar produto                       ");
	System.out.println("            4 - Atualizar produto                    ");
	System.out.println("            5 - Apagar produto                       ");
	System.out.println("            6 - Sair                                 ");
	System.out.println("                                                     ");
	System.out.println("*****************************************************");
	System.out.println("Digite a opção desejada:                             ");
	System.out.println("                                                     "+ Cores.TEXT_RESET);	
	
	try {
		opcao = leia.nextInt();
	}catch(InputMismatchException e){
		System.out.println("\nDigite um número inteiro!");
		leia.nextLine();
		opcao=0;
	}	
	            if (opcao == 6) {
				System.out.println(Cores.TEXT_BLACK_BOLD + "\nDescubra o poder da sua beleza com Magic Beauty!");
				sobre();
				leia.close();
				System.exit(0);
			}
				
			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_BLACK + "Cadastrar produto\n\n");
					
					System.out.println("Digite o código do produto: ");
					codigo = leia.nextInt();
					System.out.println("Digite a marca do produto");
					leia.skip("\\R?");
					marca = leia.nextLine();
					
					do {
						System.out.println("Digite o tipo do produto (1- Base ou 2- Corretivo): ");
						tipo = leia.nextInt();
					}while(tipo < 1 && tipo > 2);
					
					System.out.println("Digite o preço do produto (R$): ");
					preco = leia.nextFloat();
					
					switch(tipo) {
					case 1 -> {
						System.out.println("Digite a tonalidade: ");
						tonalidade = leia.next();
						loja.cadastrar(new Base(loja.gerarNumero(), codigo, tipo, marca, preco, tonalidade));
					}
					case 2 -> {
						System.out.println("Digite a tonalidade: ");
						cor = leia.next();
						loja.cadastrar(new Corretivo(loja.gerarNumero(), codigo, tipo, marca, preco, cor));
					}
			}
					        keyPress();
                    		break;
				case 2:
					System.out.println(Cores.TEXT_BLACK + "Listar todos os produtos\n\n");
					loja.listarTodos();
					keyPress();
                    		break;
			
				case 3:
					System.out.println(Cores.TEXT_BLACK + "Buscar produto\n\n");
					
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					loja.procurarPorNumero(numero);
					keyPress();
                    		break;
				case 4:
					System.out.println(Cores.TEXT_BLACK + "Atualizar produto\n\n");
					
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					var buscaLoja = loja.buscarNaCollection(numero);
					
					if(buscaLoja != null) {
						
						tipo = buscaLoja.getTipo();
						
						System.out.println("Digite o código: ");
						codigo = leia.nextInt();
						System.out.println("Digite o nome da marca: ");
						leia.skip("\\R?");
						marca = leia.nextLine();
						
						System.out.println("Digite o valor do produto (R$): ");
						preco = leia.nextFloat();
						
						switch (tipo) {
					    case 1 -> {
					        System.out.println("Digite a tonalidade: ");
					        tonalidade = leia.next();
					        loja.atualizar(new Base(buscaLoja.getNumero(), tipo, codigo, marca, preco, tonalidade));
					    }
					    case 2 -> {
					        System.out.println("Digite a cor: ");
					        cor = leia.next();
					        loja.atualizar(new Corretivo(buscaLoja.getNumero(), tipo, codigo, marca, preco, cor));
					    }
					    default -> {
					        System.out.println("Tipo de produto inválido!");
					    }
					}
					}else {
						System.out.println("O produto não foi encontrado!");
						
					}
					
					keyPress();
                    		break;
				case 5:
					System.out.println(Cores.TEXT_BLACK + "Apagar produto\n\n");
					
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					loja.deletar(numero);
					
					keyPress();
                   	 	break;
				case 6:
					System.out.println(Cores.TEXT_BLACK + "Sair\n\n");
					keyPress();
                    		break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
					keyPress();	
					break;
			}
		}
    }

    public static void sobre() {
	System.out.println("\n*********************************************************");
	System.out.println("Projeto Desenvolvido por Sandy Machado");
	System.out.println("Linkedin: linkedin.com/in/sandy-machado-/ ");
	System.out.println("Github: github.com/sandymachadoo");
	System.out.println("*********************************************************");
   
	}
    
    public static void keyPress () {
    	
    	try {
    		
    		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
    		System.in.read();
    		
    	} catch (IOException e) {
    		
    		System.out.println("Você pressionou uma tecla diferente de enter!");
    	}
    }
}