
/* Projeto com conceitos de polimorfismo aplicados:
 * - Herança
 * - Métodos com anotação @Override
 * 
 * O projeto consiste na exibição de etiquetas de produtos, tendo 
 * 3 tipos: Comum, importado e usado, cada um com suas características.
 * */

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantityOfProducts;
		List<Product> products = new ArrayList<Product>();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		quantityOfProducts = sc.nextInt();
		
		for(int i=1; i<quantityOfProducts+1; i++) {
			System.out.print("\nCommon, used or imported (c/u/i)?: ");
			sc.nextLine();
			char ans = sc.next().charAt(0);
			System.out.print("\nName: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("\nPrice: ");
			Double price = sc.nextDouble();
			
			if(ans == 'u') {
				System.out.println("\nManufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String date = sc.nextLine();
				products.add(new UsedProduct(name, price, LocalDate.parse(date, dtf)));
			}
			else if(ans == 'i') {
				System.out.print("\nCustoms Fee: ");
				Double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
			else
			{
				products.add(new Product(name, price));
			}
		}
		
		System.out.println("\nPRICE TAGS:\n");
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		
		
	}

}
