package entities;

public class Conta {

	private String nome;
	private double saldo;
	private int numConta;
	
	public Conta(String nome, double saldo, int numConta)
	{
		this.nome = nome;
		this.saldo = saldo;
		this.numConta = numConta;
	}
	
	public Conta(String nome, int numConta)
	{
		this.nome = nome;
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumConta() {
		return numConta;
	}
	
	public void depositar(double valor)
	{
		saldo += valor;
	}
	
	public void sacar(double valor)
	{
		saldo -= valor + 5.00;
	}
	
	public String toString()
	{
		return "Conta " 
				+ numConta
				+ ", Titular: "
				+ nome
				+ ", Saldo: "
				+ saldo;
	}
}
