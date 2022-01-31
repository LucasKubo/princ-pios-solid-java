package interfaces;

public class Ferrari implements Carro{
	
	@Override
	public String marca() { //Como é um método abstrato, precisa haver sobreescrita. O outro método "ligar()" já existe aqui por ser default.
		// TODO Auto-generated method stub
		return "Ferrari";
	}
	
}
