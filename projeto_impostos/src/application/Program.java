package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CompanyPayer;
import entities.IndividualPayer;
import entities.Payer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Payer> payers = new ArrayList<Payer>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1;i<n+1;i++) {
			System.out.println("\nTax payer #" + i + " data:");
			System.out.print("\nIndividual or company (i/c)? ");
			sc.nextLine();
			char ans = sc.next().charAt(0);
			System.out.print("\nName: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("\nAnual income: ");
			Double income = sc.nextDouble();
			
			if(ans == 'i') {
				System.out.print("\nHealth expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				payers.add(new IndividualPayer(name, income, healthExpenditures));
			}
			else {
				System.out.print("\nNumber of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				payers.add(new CompanyPayer(name, income, numberOfEmployees));
			}
		}
		
		Double totalTaxes=0.0;
		System.out.println("\nTAXES PAID:");
		for(Payer p : payers) {
			System.out.println("\n" + p.getName() + ": $ " + p.getTaxes());
			totalTaxes += p.getTaxes();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + totalTaxes);
	}

}
