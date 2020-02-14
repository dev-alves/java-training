package decorator;

public class Main {
	
	public static void main(String[] args) {
		Arma arma = null;
		arma = new BasicoDaArma(arma);
		arma = new Mira(arma);
		
		arma.montar();
	}

}
