package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class ProgramTriangle {
	public static void main(String args[])
	{
		Triangle x, y;
		Scanner sc;
		double areaX, areaY, p;
		
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter now the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f%n", areaY);
		
		if(areaX > areaY)
		{
			System.out.println("Large area: x");
		}
		else
		{
			System.out.println("Large area: y");
		}
		
		sc.close();
	}
}
