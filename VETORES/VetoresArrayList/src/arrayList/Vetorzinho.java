package arrayList;

import java.util.Scanner;
import java.util.ArrayList;

public class Vetorzinho {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
		String nome;
		String continuar;
		
		do {
			System.out.print("Digite um nome: ");
			nome = input.nextLine();
			
			nomes.add(nome);
			
			System.out.print("Deseja adicionar outro nome? (s/n): ");
			continuar = input.nextLine();
			
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println("\nNomes Cadastrados: ");
		
		for (String nomeCadastrado : nomes) {
			System.out.println(nomeCadastrado);
		}
		
		input.close();

	}

}
