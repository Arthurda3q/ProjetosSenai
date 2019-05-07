public class Conta {

	public int numero;
	private Cliente cliente; // o primeiro cliente é da class.
	private double saldo; // visivel apenas nesta classe
	private String extrato = "";
	
	Conta (Cliente cliente){
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	

	public double getSaldo(){
		return this.saldo;
		
	}
	
	public String getExtrato(){
		return extrato;
	}
	
	public boolean depositar(double valor) {
		extrato += "\nC + R$ "+String.format("%,.2f", valor);
		saldo += valor;

		return true;
	}
	
	public boolean sacar(double valor){

		if (valor > saldo){ // caso o saldo seja menor que o valor de saque  entao ele vai parar. (Para não negativar.)
			return false;
		}
		extrato += "\nD - R$ "+ String.format("%,.2f", valor);
		saldo -= valor;
		return true;
	}
	

}
