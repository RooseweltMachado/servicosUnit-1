package br.com.unit;

public class SolicitacaoDTO {
	private String nomeCurso;
	private double qtdHoras; 
	private String urlPdf;
	private String matriculaAluno;
	private String atividade;
	private boolean homolog;
	
	public SolicitacaoDTO() {
		
	}

	public SolicitacaoDTO(String nomeCurso, double qtdHoras, String urlPdf, String matriculaAluno, String atividade,
			boolean homolog) {
		
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



	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
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

	public boolean isHomolog() {
		return homolog;
	}

	public void setHomolog(boolean homolog) {
		this.homolog = homolog;
	}
	
	
}
