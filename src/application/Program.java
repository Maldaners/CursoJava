package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println(" entre com os valores dos lados do triangulo X");
		System.out.println(" lado A: ");
		xA= sc.nextDouble();
		System.out.println(" lado B: ");
		xB = sc.nextDouble();
		System.out.println(" lado C: ");
		xC = sc.nextDouble();
		
		System.out.println(" entre com os valores dos lados do triangulo Y");
		System.out.println(" lado A: ");
		yA= sc.nextDouble();
		System.out.println(" lado B: ");
		yB = sc.nextDouble();
		System.out.println(" lado C: ");
		yC = sc.nextDouble();
		
		double  p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) *(p - xB) *(p - xC)  );
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) *(p - yB) *(p - yC)  );
		
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
