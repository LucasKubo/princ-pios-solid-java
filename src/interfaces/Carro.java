package interfaces;

public interface Carro {
	String marca(); // m�todo abstrato
	
	default void ligar () { //m�todo default
		System.out.println("Ligando !");
	}
}
