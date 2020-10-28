import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite o numero de casos de teste");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("digite o primeiro valor");
			double a = sc.nextDouble();
			
			System.out.println("digite o segundo valor");
			double b = sc.nextDouble();
			
			System.out.println("digite o terceiro valor");
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.println("a média ponderada dos valores é" + media);
		}
		
		sc.close();
	}
}
