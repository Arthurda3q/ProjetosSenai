import java.util.Date;


public class Autorizacao {
	
	/*Parte02
Construa a Classe
Autorizacao
Com os atributos com encapsulamento private construa todos os métodos acesso e retorno.
·         aluno
·         turma
·         curso
·         turno
·         tipoAutorizacao
·         motivo
·         dataHora
·         responsavel*/

	
	private String turma;
	private String curso;
	private char turno;
	private String TipoAut;
	private String motivo;
	private String responsavel;
	private Date horas;
	
	public Date getHoras() {
		return horas;
	}
	public void setHoras(Date horas) {
		this.horas = horas;
	}
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
	public String getTipoAut() {
		return TipoAut;
	}
	public void setTipoAut(String tipoAut) {
		TipoAut = tipoAut;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	


	
	

	
	
}
