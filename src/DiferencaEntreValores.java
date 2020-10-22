import java.util.Scanner;

public class DiferencaEntreValores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ValorA, ValorB, ValorC, ValorD, diferenca;
		
		System.out.println("digite o valor 1:");
	    ValorA = sc.nextInt();
	    System.out.println("digite o valor 2:");
	    ValorB = sc.nextInt();
	    System.out.println("digite o valor 3:");
	    ValorC = sc.nextInt();
	    System.out.println("digite o valor 4:");
	    ValorD = sc.nextInt();

	    diferenca = ValorA * ValorB - ValorC * ValorD;

	    System.out.println("A diferenca dos produtos A e B ("+ ValorA +" e " + ValorB + ") e dos valores C e D (" + ValorC + " e " +ValorD + ")"
	    		+ " é: " + diferenca);	
		
		sc.close();
	}
}