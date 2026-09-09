package conta;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		double raiz;
		
		
		do {
			System.out.println("Informe um número: ");
			numero = leia.nextInt();
			
			raiz = Math.sqrt(numero);
			
			if (numero <= 0) {
				System.out.println("Número invalido!!");
			} else {
				System.out.println();
				System.out.println("Valor informado: " + numero);
				System.out.println("Número informado ao quadrado: " + (numero * numero));
				System.out.println("Número informado ao cubo: " + (numero * numero * numero));
				System.out.println("Raiz quadrada do número: " + Math.round(raiz));
			}
			
		} while (numero > 0);

	}

}
