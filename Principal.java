package aula03;

public class Principal {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Érick Fernandes", "000.000.000-01", 1000);
		Cliente cliente2 = new Cliente("Lucas Oliveira", "001.***.***-**", 5000);
	
		ContaCorrente conta = new ContaCorrente("001", 123, cliente1);
		conta.deposito(1000);

		
		ContaPoupanca contaPoupanca = new ContaPoupanca("001", 43, cliente2);
		contaPoupanca.deposito(1000);
		
		
		conta.calculaTributos();
		contaPoupanca.calculaTributos();
		
		conta.calculaRendimentos();
		contaPoupanca.calculaRendimentos();
	}
}