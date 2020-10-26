import java.util.Scanner; 

public class ParOuImpar {

	static int numero;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		if (numero % 2 == 0)
		{
			System.out.println("O Número digitado é Par");
		} else {
			System.out.println("O Número digitado é ímpar");
		}
		
		sc.close();
	}
	
}
