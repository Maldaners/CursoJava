import java.util.Scanner;


public class TesteScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);     //(System.in) para entrada do teclado
		
		String x; 
		x = sc.next();
			
		
		System.out.println("voce digitou: "+x);
	
		sc.close();
		
	}
	
	
	
}


