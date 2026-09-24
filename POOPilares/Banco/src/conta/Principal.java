package conta;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria(1, "Edimilson", 120.50);
		
		conta1.exibirDados();
		
		System.out.println();
		
		ContaBancaria conta2 = new ContaBancaria(67, "Thung Thung Thung Judeu", 67.00);
		
		conta2.exibirDados();
		
		System.out.println();
		
		System.out.println("Deposito com 10: ");
		conta1.depositar(10);
		conta1.consultarSaldo();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Deposito com valor negativo: ");
		conta1.depositar(-3);
		conta1.consultarSaldo();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Saque com valor inferior ao saldo: ");
		conta1.sacar(100.50);
		conta1.consultarSaldo();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Saque com um valor maior que o saldo: ");
		conta1.sacar(50.00);
		conta1.consultarSaldo();
	}

}
