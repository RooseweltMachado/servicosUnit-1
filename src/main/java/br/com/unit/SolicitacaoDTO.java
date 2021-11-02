package br.com.unit;

public class SolicitacaoDTO {
	private String nomeCurso;
	private double qtdHoras; 
	private String urlPdf;
	private String matriculaAluno;
	private String dataTermino;
	private boolean homolog;
	
	public SolicitacaoDTO() {
		
	}
	
	public SolicitacaoDTO(String nomeCurso, double qtdHoras, String urlPdf, String matriculaAluno, String dataTermino,
			boolean homolog) {
		
		this.nomeCurso = nomeCurso;
		this.qtdHoras = qtdHoras;
		this.urlPdf = urlPdf;
		this.matriculaAluno = matriculaAluno;
		this.dataTermino = dataTermino;
		this.homolog = homolog;
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

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}

	public boolean isHomolog() {
		return homolog;
	}

	public void setHomolog(boolean homolog) {
		this.homolog = homolog;
	}
	
	
}
