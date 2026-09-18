package horario;

public class Principal {

	public static void main(String[] args) {
		Horario Horario1 = new Horario(0 , 0, 0);
		
		System.out.println("Primeira hora: ");
		Horario1.exibir();
		System.out.println("Quantidade de segundos: " + Horario1.calcularSegundos());
		System.out.println();
		
		Horario1.hora = 8;
		Horario1.minuto = 15;
		Horario1.segundo = 30;
		System.out.println("Segunda hora: ");
		Horario1.exibir();
		System.out.println("Quantidade de segundos: " + Horario1.calcularSegundos());
		System.out.println();
		
		System.out.println("Terceira hora: ");
		Horario1.hora = 14;
		Horario1.minuto = 20;
		Horario1.segundo = 5;
		
		Horario1.exibir();
		System.out.println("Quantidade de segundos: " + Horario1.calcularSegundos());
		System.out.println();
		
		
	}

}
