package Operacoes;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, resultado, numeroEscolha;
		
			System.out.println("Digite o primeiro número: ");
			numero1 = leia.nextInt();
			
			System.out.println("Digite o segundo número: ");
			numero2 = leia.nextInt();
			
			do {
				System.out.println("1 - Calcular média");
				System.out.println("2 - subtrair o menor número do maior");
				System.out.println("3 - multiplicar os números");
				System.out.println("4 - Dividir o primeiro número pelo segundo");
				System.out.println();
				
				System.out.println("Digite um número: ");
				numeroEscolha = leia.nextInt();
				
				
			} while (numeroEscolha < 1 || numeroEscolha > 4);
			
			switch (numeroEscolha) {
			case 1:
				System.out.println("Média: " + ((numero1 + numero2)/ 2));
				break;
			case 2:
				if (numero1 > numero2) {
					System.out.println("Subtração do maior valor: " + (numero1 - numero2));
				} else {
					System.out.println("Subtração do maior valor: " + (numero2 - numero1));
				}
				break;
			case 3:
				System.out.println("Multiplicação dos números: " + (numero1 * numero2));
				break;
			case 4:
				if (numero2 != 0) {
					System.out.println("Divição dos números: " + (numero1 / numero2));
				} else System.out.println("Divisão impossivel!!");
				break;
			
			default:
			}
			
			
			
		

	}

}
