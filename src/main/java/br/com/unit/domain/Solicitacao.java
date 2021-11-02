package br.com.unit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Solicitacao {
	
	@Id @GeneratedValue
	private Long id;
	private String nomeCurso;
	private double qtdHoras; 
	private String urlPdf;
	private String matriculaAluno;
	private String dataTermino;
	private boolean homolog;
	
	public Solicitacao(){}

	public Solicitacao(Long id, String nomeCurso, double qtdHoras, String urlPdf, String matriculaAluno,
			String dataTermino, boolean homolog) {
		super();
		this.id = id;
		this.nomeCurso = nomeCurso;
		this.qtdHoras = qtdHoras;
		this.urlPdf = urlPdf;
		this.matriculaAluno = matriculaAluno;
		this.dataTermino = dataTermino;
		this.homolog = homolog;
	}

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isHomolog() {
		return homolog;
	}

	public void setHomolog(boolean homolog) {
		this.homolog = homolog;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getUrlPdf() {
		return urlPdf;
	}

	public void setUrlPdf(String urlPdf) {
		this.urlPdf = urlPdf;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	
}
