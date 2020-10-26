import java.util.Scanner; 

public class InteiroNegativoOuNao {
	static int numero;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		
		if (numero < 0)
		{
			System.out.println("O Número digitado é negativo");
		} else  {
			System.out.println("O número informado não é negativo");
		}
		
		
		
		sc.close();
		
		
	}

}
