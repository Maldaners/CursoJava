import java.util.Scanner; 

public class ParOuImpar {

	static int numero;
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		numero = sc.nextInt();
		
		if (numero % 2 == 0)
		{
			System.out.println("O N�mero digitado � Par");
		} else {
			System.out.println("O N�mero digitado � �mpar");
		}
		
		sc.close();
	}
	
}
