package dates;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatasDomingosVO {

	private LocalDate domingoDaSemana;
	private List<LocalDate> domingos = new ArrayList<LocalDate>();
	private Integer totalDeDomingos;

	public LocalDate getDomingoDaSemana() {
		return domingoDaSemana;
	}

	public void setDomingoDaSemana(LocalDate domingoDaSemana) {
		this.domingoDaSemana = domingoDaSemana;
	}

	public List<LocalDate> getDomingos() {
		return domingos;
	}

	public void setDomingos(List<LocalDate> domingos) {
		this.domingos = domingos;
	}

	public Integer getTotalDeDomingos() {
		return totalDeDomingos;
	}

	public void setTotalDeDomingos(Integer totalDeDomingos) {
		this.totalDeDomingos = totalDeDomingos;
	}

}
