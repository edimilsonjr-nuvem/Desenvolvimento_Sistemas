package conta;

public class ContaEspecial extends ContaBancaria {
	
	private double limiteCredito;

	public ContaEspecial(int numeroConta, String nomeCliente, double saldo, double limiteCredito) {
		super(numeroConta, nomeCliente, saldo);
		this.limiteCredito = limiteCredito;
	}
	
	

}
