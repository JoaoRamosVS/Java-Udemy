package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos empregados serão registrados?: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		
		List<Employee> lista = new ArrayList<>();
		
		for(int i=0; i<qtd; i++)
		{
			System.out.println("Empregado #" + i+1 + ": ");
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			
			if(lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null) != null)
			{
				System.out.println("Este id já está preenchido e este funcionário não será cadastrado.");
			}
			else
			{
				lista.add(new Employee(id, nome, salario));
			}
		}
		
		System.out.println("Digite o id do empregado que receberá aumento de salário: ");
		int id = sc.nextInt();
		sc.nextLine();
		Employee e = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(e != null)
		{
			System.out.println("Digite a porcentagem de aumento desejada: ");
			e.aumentarSalario(sc.nextDouble());
		}
		else
			System.out.println("Este id não existe.");
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		for(Employee p : lista)
		{
			System.out.println(p.getId() + ", " + p.getNome() + ", R$" + p.getSalario());
		}
	}

}
