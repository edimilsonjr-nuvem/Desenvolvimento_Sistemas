package horario;

public class Horario {
	int hora, minuto, segundo;

	public Horario() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	public Horario(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public void exibir() {
		if (hora < 0 || hora > 23) {
			System.out.printf("%02d", hora = 0);
		} else if (minuto < 0 || minuto > 59) {
			System.out.printf("%02d", minuto = 0);
		} else if (segundo < 0 || segundo > 59) {
			System.out.printf("%02d", segundo = 0);
		} else System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
	}
	
	public int calcularSegundos() {
		return (3600 * hora) + (60 * minuto) + segundo;
	}
	
}
