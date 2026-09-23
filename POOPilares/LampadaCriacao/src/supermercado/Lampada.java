package supermercado;

public class Lampada {
	private String marca;
    private double potencia;
    private double preco;
    private boolean ligada;
    
    
   
	public Lampada() {
		this.marca = "";
		this.potencia = 0.0;
		this.preco = 0.0;
		this.ligada = false;
	}
	
	
	public Lampada(String marca, double potencia, double preco, boolean ligada) {
		this.marca = marca;
		this.potencia = potencia;
		this.preco = preco;
		this.ligada = ligada;
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	 public void mostrarEstado() {
		 System.out.printf("Marca: %s%nPotência: %.0f W%nPreço: R$%.2f%n"
	        		+ "Está ligada?: ", marca, potencia, preco, ligada);
		 
	        if (ligada) {
	            System.out.println("A lâmpada está ligada.");
	        } else {
	            System.out.println("A lâmpada está desligada.");
	        }
	    }
    
    
}
