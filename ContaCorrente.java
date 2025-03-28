package aula03;

public class ContaCorrente extends Conta implements Tributavel, Rentavel{
	private double limiteChequeEspecial;
	private double taxaManutencao;
	
	public ContaCorrente(String agencia, int numeroDaConta, Cliente cliente) {
		super(agencia, numeroDaConta, cliente);
		this.limiteChequeEspecial = 1000;
		this.taxaManutencao = 10;
	}
	
	public void saque(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor; 
			System.out.println("Saque realizado");
		}else if (valor > this.saldo && valor <= this.saldo + this.limiteChequeEspecial) {
			this.limiteChequeEspecial -= (valor - this.saldo);
			this.saldo = 0;
			System.out.println("Saque realizado");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public String toString() {
		return "Conta: "+this.numeroDaConta+" Saldo: "+this.saldo+" Limite: "+this.limiteChequeEspecial;
	}

	public void calculaTributos() {
		System.out.println("Tributo: "+this.saldo * 0.1);
	}
	
	public void calculaRendimentos() {
		System.out.println("Rendimentos: "+this.saldo * 0.1);
	}
}