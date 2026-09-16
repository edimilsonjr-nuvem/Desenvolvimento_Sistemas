package exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> convidados = new ArrayList<>();
		String nome;
		String novoNome;
		String nomeInformar;
		int opcao;
		
		do {
			System.out.println("///////// OPÇÕES DE ACESSO /////////");
			System.out.println("1 - Adicionar convidado \n" 
					+ "2 - alterar convidado \n" 
					+ "3 - remover convidado \n" 
					+ "4 - procurar convidado \n" 
					+ "5 - Exibir convidados \n" 
					+ "6 - Encerrar");
			opcao = Integer.parseInt(leia.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do convidado: ");
				nome = leia.nextLine();
				convidados.add(nome);
				break;
			case 2:
				System.out.print("Posição do convidado: ");
				int posicao = Integer.parseInt(leia.nextLine());
				System.out.println("Digite o novo nome: ");
				novoNome = leia.nextLine();
				
				 if (posicao >= 0 && posicao < convidados.size()) {
                     convidados.set(posicao, novoNome);
                 } else {
                     System.out.println("Posicao invalida");
                 }
				break;
			case 3:
				System.out.println("Solicite um nome para a remoção: ");
				nome = leia.nextLine();
				
				convidados.contains(nome);
				
				if (convidados.contains(nome) == true) {
					convidados.remove(nome);
				} else System.out.println("Esse convidado já não existe!");
				break;
			case 4:
				System.out.println("Informe um convidado: ");
				nomeInformar = leia.nextLine();
				
				convidados.indexOf(nomeInformar);
				
				System.out.println("O convidado " + nomeInformar + " está na posição " + convidados.indexOf(nomeInformar));
				break;
			case 5:
				for (String convidado: convidados) {
					System.out.println(convidado);
				}
				break;
			case 6:
				System.out.println("Programa encerrado!");
				break;
				default:
					System.out.println("Opção invalida!");
			}
			
		} while (opcao != 6);
		

	}

}
