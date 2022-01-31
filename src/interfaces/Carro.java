package interfaces;

public interface Carro {
	String marca(); // método abstrato
	
	default void ligar () { //método default
		System.out.println("Ligando !");
	}
}
