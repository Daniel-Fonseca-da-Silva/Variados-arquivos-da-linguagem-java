package basicOfBasic;

import java.util.Locale;
import java.util.Scanner;

public class ShowInformation {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// name, sex(f or m), height 
		String name = sc.next();
		char sex = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}
}
