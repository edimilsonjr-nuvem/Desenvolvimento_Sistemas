package estoque;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		for (Map.Entry<String, Integer> e: estoque.entrySet()) {
			System.out.println("Produto: " + e.getKey()
			+ " | Estoque: " + e.getValue());
		}
		System.out.println();
		
		System.out.println("Digite um produto para vê o estoque: ");
		String produtoEstoque = leia.nextLine();
		
		if (estoque.containsKey(produtoEstoque)) {
			int quantidade = estoque.get(produtoEstoque);
			System.out.print("Quantidade no estoque: " + quantidade);
		} else {
			System.out.println("Produto não encontrado");
		}
		
		System.out.println();
		
		estoque.put("Mouse", 20);
		
		System.out.println();
		
		estoque.remove("Notebook");
		
		System.out.println();
		
		for (Map.Entry<String, Integer> e: estoque.entrySet()) {
			System.out.println("Produto: " + e.getKey()
			+ " | Estoque: " + e.getValue());
		}
	}

}
