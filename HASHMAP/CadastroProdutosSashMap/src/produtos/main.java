package produtos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		HashMap<Integer, Produto> produtos = new HashMap<>();
		
		produtos.put(100, new Produto("Teclado mecânico", 150, 100));
		produtos.put(101, new Produto("Mouse pad", 45, 150));
		produtos.put(102, new Produto("Gabinete aquário", 250, 40));
		produtos.put(103, new Produto("Mouse", 145, 300));
		
		for (Map.Entry<Integer, Produto> entry : produtos.entrySet()) {
            System.out.print("Código: " + entry.getKey() + " | ");
            entry.getValue().exibirDados();
        }

		System.out.println("Informe um código: ");
		int codigo = leia.nextInt();
		
		if (produtos.containsKey(codigo)) {
			Produto produtoEncontrado = produtos.get(codigo);
			
			System.out.printf("Nome do produto: %s%nPreço do produto: %.2f%n"
					+ "Quantidade em estoque: %d%n", produtoEncontrado.getNome(), produtoEncontrado.getPreco(),
					produtoEncontrado.getQuantidade());
		} else {
			System.out.println("Produto não encontrado!");
		}
		
		leia.close();
	}

}
