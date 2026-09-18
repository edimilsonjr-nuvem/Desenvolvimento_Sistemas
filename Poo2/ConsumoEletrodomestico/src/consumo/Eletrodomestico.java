package consumo;

public class Eletrodomestico {
	String nome;
	double potenciaWatts, horasPorDia;
	public Eletrodomestico() {
		this.nome = "";
		this.potenciaWatts = 0.0;
		this.horasPorDia = 0.0;
	}
	public Eletrodomestico(String nome, double potenciaWatts, double horasPorDia) {
		this.nome = nome;
		this.potenciaWatts = potenciaWatts;
		this.horasPorDia = horasPorDia;
	}
	
	double consumoDiarioWh() {
		return potenciaWatts * horasPorDia;
	}
	
	double consumoMensalWh() {
		return consumoDiarioWh() * 30;
	}
	
	double consumoAnualWh() {
		return consumoMensalWh() * 12;
	}
	
	double gastoMensal(double precoKwh) {
		return (consumoMensalWh() / 1000) * precoKwh;
	}
	
	public void exibirRelatorio(double precoKwh) {
		System.out.printf("Nome do produto: %s%nPotência: %.2f W%nUso diário: %.0f horas%n"
				+ "Tarifa fictícia: %.2f por Kwh%nConsumo diário: %.2f%nConsumo mensal: %.2f%nConsumo anual: %.2f%n"
				+ "Custo mensal: %.2f%n", nome, potenciaWatts, horasPorDia, precoKwh, consumoDiarioWh(), consumoMensalWh(), consumoAnualWh(), gastoMensal(precoKwh));
	}
	
	
	
	
}
