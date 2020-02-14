package strategy.pattern;

public class Strategy {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(1000);
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		calculadoraDeImposto.calcularImposto(orcamento, icms);
		calculadoraDeImposto.calcularImposto(orcamento, iss);
	}
}
