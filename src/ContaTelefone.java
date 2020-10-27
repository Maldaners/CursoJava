import java.util.Locale;
import java.util.Scanner;

public class ContaTelefone {
	
    
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantos minutos foram utilizados?");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta+= (minutos - 100) *2.0;
			
		}
		
		System.out.println("valor da conta é R$ "+ conta);
		
		sc.close();
	}
}
       