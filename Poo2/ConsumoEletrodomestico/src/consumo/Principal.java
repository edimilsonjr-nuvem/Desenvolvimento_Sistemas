package consumo;

public class Principal {

	public static void main(String[] args) {
		Eletrodomestico ventilador = new Eletrodomestico("Ventilador", 100, 8);
		
		ventilador.exibirRelatorio(0.90);

	}

}
