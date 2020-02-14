package strategy.pattern;

public class CalculadoraDeImposto {
	
	public void calcularImposto(Orcamento orcamento, Imposto imposto) {
		System.out.println(imposto.calcular(orcamento));
	}

}
