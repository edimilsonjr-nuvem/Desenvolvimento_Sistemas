package calculo;

public class app {

	public static void main(String[] args) {
		
		double carlos = 3000;
		
		double joao = 1000;
		
		int contador = 0;
		
		while (joao <= carlos) {
			
			carlos *= 1.02;
			
			joao *= 1.05;
			
			contador++;
		}
		
		System.out.println("Quantidade de meses acumulados: " + contador);
		System.out.println("Valor acumulado de Carlos: " + Math.round(carlos));
		System.out.println("Valor acumulado de João: " + Math.round(joao));

	}

}