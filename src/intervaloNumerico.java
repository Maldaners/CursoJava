import java.util.Scanner;
import java.util.Locale; 

public class intervaloNumerico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um n�mero");
		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0)
		{
			System.out.println("o n�mero digitado est� fora de intervalo");
		}
		else if ( numero <= 25.0) {
			System.out.println(" o n�mero est� no intervalo de [0,25]");
		}
		else if ( numero <= 50.0) {
			System.out.println(" o n�mero est� no intervalo de [25, 50]");
		}
		else if ( numero <= 70.0) {
			System.out.println(" o n�mero est� no intervalo de [50, 70]");
		}
		else  {
			System.out.println(" o n�mero est� no intervalo de [70, 100]");
		}
		
		sc.close();
	}
}
