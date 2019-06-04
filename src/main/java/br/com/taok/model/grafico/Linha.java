package br.com.taok.model.grafico;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Linha implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String titulo;
	private List<String> labels;
	private List<BigDecimal> valores;

	public Linha(String titulo, List<String> labels, List<BigDecimal> valores) {
		this.titulo = titulo;
		this.labels = labels;
		this.valores = valores;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public List<String> getLabels() {
		return labels;
	}


	public List<BigDecimal> getValores() {
		return valores;
	}
}
