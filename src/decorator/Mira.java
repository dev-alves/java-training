package decorator;

public class Mira extends ArmaDecorator{

	private Arma arma;
	
	public Mira(Arma arma) {
		super(arma);
		this.arma = arma;
	}
	
	@Override
	public void montar() {
		this.arma.montar();
		System.out.println("adicionando uma mira a arma");
	}

}
