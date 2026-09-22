package capitais;

import java.util.HashMap;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("Rio de Janeiro", "Rio de Janeiro");
		capitais.put("São Paulo", "São Paulo");
		capitais.put("Minas Gerais", "Belo Horizonte");
		capitais.put("Bahia", "Salvador");
		capitais.put("Paraná", "Curitiba");
		
		System.out.print("Digite um estado: ");
		String nome = leia.nextLine();
		
		if (capitais.containsKey(nome)) {
			nome = capitais.get(nome);
			System.out.println("Capital do estado: " + nome);
		} else {
			System.out.println("Estado não cadastrado!");
		}
		
		leia.close();
	}

}
