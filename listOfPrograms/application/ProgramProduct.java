package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramProduct {
	public static void main(String args[]) {
		
		Scanner sc;
		Locale.setDefault(Locale.US);
		Product product;
		
		sc = new Scanner(System.in);
		product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("The name of product: ");
		product.name = sc.nextLine();
		System.out.println("Now the price of product: ");
		product.price = sc.nextFloat();
		System.out.println("Lastly enter quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		sc.close();
	}
}
