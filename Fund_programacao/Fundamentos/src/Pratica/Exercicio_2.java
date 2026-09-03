package Pratica;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		
		System.out.println("Digite um valor: ");
		int numero = leia.nextInt();
		
		if (numero > 20) {
			System.out.println("O número " + numero + " é maior que 20");
		} else if (numero == 20) {
			System.out.println("O número é o proprio 20");
		} else System.out.println("O número " + numero + " é menor que 20");
			
	} 

}
