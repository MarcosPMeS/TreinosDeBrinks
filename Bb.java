package entities;

public class Bb {

	private int numConta;
	private String name;
	private double contaBanco = 0.0;
	private int senha;
	
	public Bb(int numConta, String name) {
		this.numConta = numConta;
		this.name = name;
	}
	
	public Bb(int numConta, String name, double contaBanco) {
		this.numConta = numConta;
		this.name = name;
		this.contaBanco = contaBanco;	
	}
	
	public int getNumConta( ) {
		return numConta;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getContaBanco() {
		return contaBanco;
	}
	
	public void depositMoney(double amount) {
		contaBanco += amount;
	}
	
	public void saqueMoney(double amount) {
		contaBanco -= amount;
	}
	
	public String toString() {
		return "Numero da conta: " + numConta + " Nome " + name + " Saldo: " + contaBanco ;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
