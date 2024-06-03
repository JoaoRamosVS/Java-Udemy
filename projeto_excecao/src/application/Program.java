package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("\nHolder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("\nInitial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("\nWithdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, limit);
			
			System.out.print("\n\nEnter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.printf("\nNew balance: %.2f", acc.getBalance());
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
		sc.close();
	}

}
