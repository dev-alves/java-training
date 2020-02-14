package decorator;

public abstract class ArmaDecorator implements Arma {

	private Arma arma;
	
	public ArmaDecorator(Arma arma) {
		this.arma = arma;
	}

	@Override
	public void montar() {
		System.out.println("montando a arma");
	}

}
