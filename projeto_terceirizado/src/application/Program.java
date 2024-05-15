package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		int employeesNumber;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		employeesNumber = sc.nextInt();
		
		for(int i=1;i<employeesNumber+1;i++) {
			System.out.println("Employee #" + i + " data: ");
			System.out.print("Outsourced (y/n): ");
			sc.nextLine();
			char ans = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			sc.nextLine();
			Double value = sc.nextDouble();
			
			if(ans == 'y'){
				System.out.print("Additional charge: ");
				Double additional = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, value, additional));
			}
			
			else {
				employees.add(new Employee(name, hours, value));
			}
		}
		
		System.out.println("\nPAYMENTS:");
		for(Employee e : employees) {
			System.out.println(e.getName() + " -  $" + e.payment());
		}
	}

}
