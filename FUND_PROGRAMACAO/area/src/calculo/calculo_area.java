package calculo;

import java.util.Scanner;

public class calculo_area {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double base, altura, area;
		
		do {
			System.out.println("Digite a base do Triângulo: ");
			base = leia.nextDouble();
			
			System.out.println("Digite a Altura: ");
			altura = leia.nextDouble();
		} while (base <= 0 || altura <=0);
		
		area = (base * altura)/ 2;
		
		System.out.print("Sua Área: " + area);

	}

}
