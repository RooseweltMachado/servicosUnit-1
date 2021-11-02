package br.com.unit;

public class AlunoDTO {

	private String matricula;
	private String senha;
	private String curso;
	private String turno;
	private String fotourl;
	private double quantidadeHoras;
	
	public AlunoDTO() {
		
	}

	public AlunoDTO(String matricula, String senha, String curso, String turno, String fotourl,
			double quantidadeHoras) {
		this.matricula = matricula;
		this.senha = senha;
		this.curso = curso;
		this.turno = turno;
		this.fotourl = fotourl;
		this.quantidadeHoras = quantidadeHoras;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getFotourl() {
		return fotourl;
	}

	public void setFotourl(String fotourl) {
		this.fotourl = fotourl;
	}

	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	
}
