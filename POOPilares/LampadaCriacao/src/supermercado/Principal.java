package supermercado;

public class Principal extends Lampada{

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		Lampada lampada2 = new Lampada("Elgin", 120, 15.90, false);
		
		System.out.println("   ========== LÂMPADA 1 ==========");
		lampada1.setMarca("Philips");
		lampada1.setPotencia(100);
		lampada1.setPreco(12.90);
		
		 
        lampada1.mostrarEstado();
        System.out.println();

        
        lampada1.ligar();
        lampada1.mostrarEstado();
        System.out.println();
      
        lampada1.desligar();
        lampada1.mostrarEstado();
        System.out.println();
        
        System.out.println("   ========== LÂMPADA 2 ==========");
        
        lampada2.mostrarEstado();
        System.out.println();

        
        lampada2.ligar();
        lampada2.mostrarEstado();
        System.out.println();
      
        lampada2.desligar();
        lampada2.mostrarEstado();
        
	}
}
