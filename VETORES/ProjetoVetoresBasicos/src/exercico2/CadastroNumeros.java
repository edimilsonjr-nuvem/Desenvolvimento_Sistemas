package exercico2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[5];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o número na posição " + i + ": ");
			numeros[i] = leia.nextInt();
		}
		
		System.out.println();
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
 	}

}
