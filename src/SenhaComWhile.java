import java.util.Scanner;

public class SenhaComWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a senha");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("senha invalida");
			System.out.println("Digite a senha correta");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}
}
