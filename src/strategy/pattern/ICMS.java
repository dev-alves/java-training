package strategy.pattern;

public class ICMS implements Imposto {

	@Override
	public Double calcular(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50;
	}

}
