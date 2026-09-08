package tabuada;

import java.util.Scanner;

public class numero_informado {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, resultado;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero <= 0) {
				System.out.println("ERRO!! número invalido!");
			}
		} while (numero <= 0);
		
		for (int i = 1; i <= 10; i++) {
			
			resultado = numero * i;
			System.out.println(numero + " x " + i + " = "
			+ resultado);
		}

	}

}
