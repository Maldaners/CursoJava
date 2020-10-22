import java.util.Locale;
import java.util.Scanner;

public class LerValorDoRaioDeCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Raio, Area, ValorPi = 3.14159;
	    
		System.out.println("digite o valor do raio do circulo : ");
	    Raio = sc.nextDouble();

	    Area = ValorPi * Raio * Raio;

	    System.out.println("a Area total do circulo de raio " + Raio + " é igual a: " + Area);

		sc.close();
		
	}
}