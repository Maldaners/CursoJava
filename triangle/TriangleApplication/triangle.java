package TriangleApplication;

import java.util.Locale;
import java.util.Scanner;

import TriangleEntities.Triangle;
public class triangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println(" entre com os valores dos lados do triangulo X");
		System.out.println(" lado A: ");
		x.a= sc.nextDouble();
		System.out.println(" lado B: ");
		x.b = sc.nextDouble();
		System.out.println(" lado C: ");
		x.c = sc.nextDouble();
		
		System.out.println(" entre com os valores dos lados do triangulo Y");
		System.out.println(" lado A: ");
		y.a= sc.nextDouble();
		System.out.println(" lado B: ");
		y.b = sc.nextDouble();
		System.out.println(" lado C: ");
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
	
		double areaY = y.area();
		
		System.out.printf("Area do triangulo X: %.4f%n", areaX);
		System.out.printf("Area do triangulo Y: %.4f%n", areaY);
		
		if (areaX >  areaY)
		{
			System.out.println("A area de X é maior que a de Y");
		} else {
			System.out.println("A area de Y é maior que a de X");
		}
		
		sc.close();
	}
}

