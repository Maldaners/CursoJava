import java.util.Scanner;

public class MultiplosOuNao {

	static int PrimeiroNumero;
	static int SegundoNumero;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		PrimeiroNumero = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		SegundoNumero = sc.nextInt();
	
		if (PrimeiroNumero % SegundoNumero == 0 || SegundoNumero % PrimeiroNumero == 0)
		{
			System.out.println("os N�meros s�o m�ltiplos");
		} else {
			System.out.println("Os N�meros n�o s�o m�ltiplos");
		}
		
		sc.close();
	}
}
