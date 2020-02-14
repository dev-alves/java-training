package strategy.problem;

public class CalculadoraDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, String imposto) {
		
		if(imposto.equals("ICMS")) {
			double icms = orcamento.getValor() * 0.10;
			System.out.println(icms);
		} else if(orcamento.equals("ISS")) {
			double iss = orcamento.getValor() * 0.06;
			System.out.println(iss);
		}
		
		
		// E assim, quanto mais impostos, mais if's
		
	}

}
