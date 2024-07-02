package enums;

public class Main {
	public static void main(String[] args) {
			System.out.println(
				EstadoBrasileiro.RIO_JANEIRO.getNomeMaisculo() 
				+"-" +EstadoBrasileiro.RIO_JANEIRO.getSigla());
			
			for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
				System.out.println(e.getSigla()+ " - " + e.getNome());
			}
	}
}
