import java.util.*;

public class FormasGeometricas {
	
	static double a;
	static double b;
	static double c;
	static double triangulo;
	static double circulo;
	static double retangulo;
	static double quadrado;
	static double trapezio;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" Digite o valor de A ");
		a = sc.nextDouble();
		
		System.out.println(" Digite o valor de B ");
		b = sc.nextDouble();
		
		System.out.println(" Digite o valor de C ");
		c = sc.nextDouble();
		
		
		triangulo = a * c /2.0;
		System.out.println("A �rea do Tri�ngulo �: " + triangulo);
		
		
		circulo = 3.12159 * c * c;
		System.out.println("A �rea do Circulo �: " + circulo);
		
		
		retangulo = a * b;
		System.out.println("A �rea do Ret�ngulo �: " + retangulo);
		
		
		quadrado = b * b;
		System.out.println("A �rea do Quadrado �: " + quadrado);
		
		
		trapezio = (a = b) / 2.0 * c;
		System.out.println("A �rea do Trap�zio �: " + trapezio);
		
		sc.close();
		
		
	}
	

}
