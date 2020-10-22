import java.util.Scanner;

public class LerDoisValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int PrimeiroValor, SegundoValor, ValorDaSoma;

		PrimeiroValor= sc.nextInt();
		SegundoValor = sc.nextInt();

		ValorDaSoma = PrimeiroValor+ SegundoValor;

		System.out.println("SOMA = " + ValorDaSoma);

		sc.close();
	}
}