package aula03;

public class Cliente {
	private String nome;
	private String cpf;
	private double mediaSalarial;
	
	public Cliente(String nome, String cpf, double mediaSalarial) {
		System.out.println("Cadastrando novo cliente");
		System.out.println();
		this.nome = nome;
		this.cpf = cpf;
		this.mediaSalarial = mediaSalarial;
	}
	
	public void imprimeDados() {
		System.out.println("DADOS DO CLIENTE");
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Média Salarial: " + this.mediaSalarial);
		System.out.println();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf.substring(0, 3) + ".***.***-**";
	}
}