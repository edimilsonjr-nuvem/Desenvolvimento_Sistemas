package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double[] notas = new double[4];
		
		double soma = 0;
		
		double media;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª nota: ");
			notas[i] = Double.parseDouble(leia.nextLine());
			
			soma += notas[i];
		}
		
		System.out.println();
		
		media = soma / notas.length;
		
		System.out.println("Notas Cadastradas: ");
		
		for (Double nota: notas) {
			
			System.out.println(nota);
		}
		
		System.out.println();
		System.out.println("Média: " + Math.round(media));
		
	}

}
