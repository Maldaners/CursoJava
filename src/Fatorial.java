import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("digite o numero:");
		int numero = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=numero; i++) {
			fat = fat * i;
		}
		
		System.out.println("o fatoreal é: "+fat);
		
		sc.close();
	}
}