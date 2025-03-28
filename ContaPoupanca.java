package aula03;

public class ContaPoupanca extends Conta implements Tributavel, Rentavel{

	public ContaPoupanca(String agencia, int numeroDaConta, Cliente cliente) {
		super(agencia, numeroDaConta, cliente);
	}
	
	public void saque(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor; 
			System.out.println("Saque realizado");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void calculaTributos() {
		System.out.println("Tributos: "+ this.saldo * 0.01);
	}
	
	public void calculaRendimentos() {
		System.out.println("Rendimentos: "+this.saldo * 0.005);
	}
}
