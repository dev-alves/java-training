package decorator;

public class BasicoDaArma extends ArmaDecorator {
	
	public BasicoDaArma(Arma arma) {
		super(arma);
	}

	@Override
	public void montar() {
		super.montar();
		System.out.println("adicionando o básico");
	}
}
