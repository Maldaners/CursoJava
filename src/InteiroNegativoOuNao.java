import java.util.Scanner; 

public class InteiroNegativoOuNao {
	static int numero;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		numero = sc.nextInt();
		
		if (numero < 0)
		{
			System.out.println("O N�mero digitado � negativo");
		} else  {
			System.out.println("O n�mero informado n�o � negativo");
		}
		
		
		
		sc.close();
		
		
	}

}
