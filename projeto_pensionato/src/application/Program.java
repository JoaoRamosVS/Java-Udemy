package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int opcao;
		
		Scanner sc = new Scanner(System.in);
		Quarto[] quarto = new Quarto[10];
		
		System.out.println("Quantos quartos serão alugados?: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<qtd;i++)
		{
			System.out.println("Quarto: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			quarto[opcao] = new Quarto();
			System.out.println("Nome: ");
			quarto[opcao].setNome(sc.nextLine());
			System.out.println("Email: ");
			quarto[opcao].setEmail(sc.nextLine());
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		
		for(int i=0;i<quarto.length;i++)
		{
			if(quarto[i] != null)
			{
				System.out.println(i + ": " + quarto[i].getNome() + ", " + quarto[i].getEmail());
				System.out.println();
			}
		}
	}

}
