package basicOfBasic;

import java.util.Locale;
import java.util.Scanner;

public class ShowBalance {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char gender = 'f';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		
		System.out.print("Good Morning!");
		System.out.println("Good Afternoon!");
		System.out.println("Good Night!");
		System.out.println("------------------");
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(new Locale("pt"));
		System.out.printf("%.4f%n", balance);
		System.out.println("------------------");
		System.out.printf("%s is %d years old you gender is %s today your balance = %.2f credits%n", name, age, gender, balance);
		
		sc.close();

	}

}
