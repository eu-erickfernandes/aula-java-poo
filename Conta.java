package aula03;

public abstract class Conta {
	protected String agencia;
	protected int numeroDaConta;
	protected double saldo;
	private Cliente cliente;
	protected boolean bloqueada;
	
	public Conta(String agencia, int numeroDaConta, Cliente cliente) {
		System.out.println("Cadastrando nova conta...");
		
		this.agencia = agencia;
		this.numeroDaConta = numeroDaConta;
		this.cliente = cliente;
		this.saldo = 0.0;
		this.bloqueada = false;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
		System.out.println("Deposito realizado");
	}
	
	public String toString() {
		return "Conta: "+this.numeroDaConta+" Saldo: "+this.saldo;
	}
}