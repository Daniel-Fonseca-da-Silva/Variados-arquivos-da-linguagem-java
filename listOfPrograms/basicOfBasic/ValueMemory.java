package basicOfBasic;

import java.util.Locale;
import java.util.Scanner;

public class ValueMemory {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if((n & mask) != 0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		sc.close();
	}
}
