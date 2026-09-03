package Pratica;


public class Exercicio_1 {

	public static void main(String[] args) {
		
		String numero1 = "10";
		String numero2 = "5";
		String preco = "12.50";
		
		System.out.println(numero1 + numero2);
		System.out.println();
		
		int n1 = Integer.parseInt(numero1);
		
		int n2 = Integer.parseInt(numero2);
		
		System.out.print("Valor Final: ");
		System.out.println(n1 + n2);
		System.out.println();
		
		System.out.print("Valor Final: ");
		System.out.println(n1 - n2);
		System.out.println();	
		
		System.out.print("Valor Final: ");
		System.out.println(n1 * n2);
		System.out.println();
		
		double precoConvertido = Double.parseDouble(preco);
		
		System.out.print("Preço original: " + preco + "\n\n");
		System.out.print("Preço após aumento: ");
		System.out.println(precoConvertido + 5);

	}

}
