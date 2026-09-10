package exercicio4;

import java.util.Scanner;

public class AnaliseTemperaturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double[] temperaturas = new double[7];
		
		double maiorTemperatura, menorTemperatura;
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Digite a " + (i + 1) + "ª temperatura: ");
			temperaturas[i] = Double.parseDouble(leia.nextLine());
		}
		
		maiorTemperatura = temperaturas[0];
		menorTemperatura = temperaturas[0];
		
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > maiorTemperatura) {
				maiorTemperatura = temperaturas[i];
			}
			
			if (temperaturas[i] < menorTemperatura) {
				menorTemperatura = temperaturas[i];
			}
		}
		
		System.out.println("Temperaturas cadastradas: ");
		
		for (double temperatura: temperaturas) {
			System.out.println(temperatura);
		}
		
		System.out.println();
		System.out.println("Maior temperatura: " + maiorTemperatura);
		System.out.println("Menor temperatura: " + menorTemperatura);

	}

}
