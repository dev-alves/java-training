package decorator;

public class AK47 extends ArmaDecorator {

	public AK47(Arma arma) {
		super(arma);
	}
	
	@Override
	public void montar() {
		super.montar();
		System.out.println("finalizando AK47");
	}

}
