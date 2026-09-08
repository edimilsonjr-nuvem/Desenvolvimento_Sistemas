package tabuada;

public class numero_fixo {

	public static void main(String[] args) {
		
		int numero = 2, resultado;
		
		for (int i = 1; i <= 10; i++) {
			
			resultado = numero * i;
			System.out.println(numero + " x " + i + " = "
			+ resultado);
		}

	}

}
