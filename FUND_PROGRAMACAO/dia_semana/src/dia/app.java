package dia;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int dia;
		
		do {
			System.out.println("Digite um número: ");
			dia = leia.nextInt();
			
			if (dia < 1 || dia > 7) {
				System.out.println("NÚMERO INVALIDO!!!");
			}
		} while (dia < 1 || dia > 7);
		
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
			
		default:
		}

	}

}
