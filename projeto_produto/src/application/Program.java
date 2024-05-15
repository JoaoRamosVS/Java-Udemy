package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite os dados do produto:");
		System.out.println("Nome: ");
		String name = sc.nextLine();
		System.out.println("Preço: ");
		double price = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Digite o numero de produtos a serem adicionados no estoque: ");
		quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.println("Digite o numero de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		sc.close();
	}

}
