
public class OperacoesMatematicas {

	public static void main(String[] args) {
		double a = 3.0;
		double b = 4.0;
		double c = -5.0;
		double A, B, C;
		double Delta, x1, x2;
		
		A = Math.sqrt(a); // raiz quadrada 
		B = Math.sqrt(b);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + a + "=" + A);
		System.out.println("Raiz quadrada de " + b + "=" + B);
		System.out.println("Raiz quadrada de 25 =" + C);
		
		
		A = Math.pow(a, b); // potenciacao
		B = Math.pow(a, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(a + " elevado a " + b + "=" + A);
		System.out.println(a + " elevado a o quadrado é " + B);
		System.out.println("5 ao quadrado é " + C);
		
		A = Math.abs(b); //valor absoluto 
		B = Math.abs(c);
		System.out.println("Valor absoluto de " + b + "=" + A);
		System.out.println("Valor absoluto de " + c + "=" + B);
		
		
		Delta =  Math.pow(b ,  2.0) - 4*a*c;
		x1 = (-b + Math.sqrt(Delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(Delta)) / (2.0 * a);
		System.out.println("o valor de x1 é: "+ x1 + ", e o valor de x2 é: "+ x2);
		
		
		
		
		
		
		
		
	}

}
