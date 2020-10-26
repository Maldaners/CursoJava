import java.util.Locale;
import java.util.Scanner;

public class DeterminarLocalDoPonto {
	
	
  public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("digite o valor de X");
	double x = sc.nextDouble();
	System.out.println("digite o valor de Y");
	double y = sc.nextDouble();
	
	if (x == 0.0 && y == 0.0) {
		System.out.println("o ponto se encontra na Origem");
	}
	else if (x == 0.0) {
		System.out.println("o ponto se encontra no Eixo Y");
	}
	else if (y == 0.0) {
		System.out.println("o ponto se encontra no Eixo X");
	}
	else if (x > 0.0 && y > 0.0) {
		System.out.println("o ponto se encontra no  primeiro quadrante");
	}
	else if (x < 0.0 && y > 0.0) {
		System.out.println("o ponto se encontra no segundo quadrante ");
	}
	else if (x < 0.0 && y < 0.0) {
		System.out.println("o ponto se encontra no terceiro quadrante");
	}
	else {
		System.out.println("o ponto se encontra no quarto quadrante");
	}
	
	sc.close();
	
}
	
}
