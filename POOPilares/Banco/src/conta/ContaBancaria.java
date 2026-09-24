package conta;

public class ContaBancaria {
	private int numeroConta;
	private String nomeCliente;
	private double saldo;
	
	
	public ContaBancaria(int numeroConta, String nomeCliente, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeCliente = nomeCliente;
		if (saldo >= 0) {
			this.saldo = saldo;
		} else System.out.println("Saldo negado!!");
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double depositar(double valor) {
		if (valor > 0) {
			saldo = saldo + valor;
			return valor + saldo;
		} else {
			System.out.println("Valor invalido!!");
		}
		return saldo;
	}
	
	public double sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			return saldo;
		} else {
			System.out.println("Saldo insuficiente!!");
		}
		return saldo;
	}
	
	public double consultarSaldo() {
		System.out.print("Seu saldo: " + saldo);
		return saldo;
	}
	
	public void exibirDados() {
		System.out.printf("Número da conta: %d%nNome do cliente: %s%n"
				+ "Seu saldo: %.2f%n", numeroConta, nomeCliente, saldo);
	}
	
	
}
