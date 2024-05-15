package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Conta conta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Digite o nome completo do titular: ");
		String nome = sc.nextLine();
		System.out.print("Deseja fazer um depósito inicial?(y/n): ");
		String i = sc.nextLine();
		if(i.equals("y"))
		{
			System.out.print("Digite o valor do depósito inicial: ");
			double saldo = sc.nextDouble();
			conta = new Conta(nome, saldo, numConta);
		}
		else 
		{
			conta = new Conta(nome, numConta);
		}
		
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Digite o valor a ser depositado: ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		
		System.out.println("");
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println("");
		System.out.print("Digite o valor a ser sacado: ");
		double saque = sc.nextDouble();
		conta.sacar(saque);
		
		System.out.println("");
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		sc.close();
	}

}
