package exercicio5;

import java.util.Scanner;

public class ParsEImpares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[8];
		int qtdPares = 0, qtdImpares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º número: ");
			numeros[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] %2 == 0) {
				System.out.println("Número " + numeros[i] + ": Par");
				
				qtdPares++;
			} else {
				System.out.println("Número " + numeros[i] + ": Impar");
				
				qtdImpares++;
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de números pares: " + qtdPares);
		System.out.println("Quantidade de números Impares: " + qtdImpares);

	}

}
