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
	private String atividade;
	private boolean homolog;
	
	public Solicitacao(){}

	public Solicitacao(Long id, String nomeCurso, double qtdHoras, String urlPdf, String matriculaAluno,
			String atividade, boolean homolog) {
		this.id = id;
		this.nomeCurso = nomeCurso;
		this.qtdHoras = qtdHoras;
		this.urlPdf = urlPdf;
		this.matriculaAluno = matriculaAluno;
		this.atividade = atividade;
		this.homolog = homolog;
	}



	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
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

	
}
