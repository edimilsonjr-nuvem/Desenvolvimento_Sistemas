package exercicio6;

import java.util.Scanner;
import java.util.ArrayList;

public class CadastroTarefas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<>();
		String tarefa;
		String continuar;
		int qtdTarefas = 0;
		
		do {
			System.out.print("Digite uma terefa: ");
			tarefa = leia.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.print("Deseja cadastra outra tarefa? (s/n): ");
			continuar = leia.nextLine();
			qtdTarefas++;
			
		} while (continuar.equalsIgnoreCase("s"));
		
		System.out.println();
		
		System.out.println("Tarefas cadastradas: ");
		
		for (String t: tarefas) {
			System.out.println(t);
		}
		
		leia.close();
		
		System.out.println();
		System.out.print("Quantidade de tarefas: " + qtdTarefas);

	}

}
