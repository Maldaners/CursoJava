import java.util.Scanner;

public class ListaImpares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de X");
		int x = sc.nextInt();
		
		System.out.println("os números ímpares são: ");
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
