import java.util.Scanner;

public class MultiplosOuNao {

	static int PrimeiroNumero;
	static int SegundoNumero;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		PrimeiroNumero = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		SegundoNumero = sc.nextInt();
	
		if (PrimeiroNumero % SegundoNumero == 0 || SegundoNumero % PrimeiroNumero == 0)
		{
			System.out.println("os Números são múltiplos");
		} else {
			System.out.println("Os Números não são múltiplos");
		}
		
		sc.close();
	}
}
