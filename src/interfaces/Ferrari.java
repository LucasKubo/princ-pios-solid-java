package interfaces;

public class Ferrari implements Carro{
	
	@Override
	public String marca() { //Como � um m�todo abstrato, precisa haver sobreescrita. O outro m�todo "ligar()" j� existe aqui por ser default.
		// TODO Auto-generated method stub
		return "Ferrari";
	}
	
}
