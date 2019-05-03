import java.util.Date;


public class Pessoa {
	
	private String nome;
	private Date dNascimento;
	private String cpf;
	private char sexo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getdNascimento() {
		return dNascimento;
	}
	public void setdNascimento(Date dNascimento) {
		this.dNascimento = dNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if (GerarValidarCpf.validarCpf(cpf))
			
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
	
	
	
