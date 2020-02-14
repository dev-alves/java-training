package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Obter todos os domingos dentro de um período
 * Retornar o todos os domingos e o domingo corrente
 * 
 * @author dev-alves
 *
 */


public class LocalDatesTraining {

	public static void main(String[] args) {
		
		DatasDomingosVO vo = new DatasDomingosVO();
		
		LocalDate dataInicial = LocalDate.of(2019, 01, 01);
		LocalDate dataFinal = LocalDate.of(2019, 12, 31);
		
		List<LocalDate> domingos = new ArrayList<LocalDate>();
		
		while(!dataInicial.isEqual(dataFinal)) {
			
			DayOfWeek diaDaSemana =  dataInicial.getDayOfWeek();
			
			if(diaDaSemana.equals(DayOfWeek.SUNDAY)) {
				if(vo.getDomingoDaSemana() == null) {
					vo.setDomingoDaSemana(dataInicial);					
				}
				
				vo.getDomingos().add(dataInicial);
			}
			
			dataInicial = dataInicial.plusDays(1);
		}
		
		if(!domingos.isEmpty() && domingos.size() > 0) {
			vo.setTotalDeDomingos(domingos.size());	
		}
		
		System.out.println(vo.getDomingoDaSemana());
		vo.getDomingos().forEach(domingo -> System.out.println(">>> domingo no dia: " + domingo));
	}
}
