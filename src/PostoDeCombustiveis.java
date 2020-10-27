import java.util.Scanner;

public class PostoDeCombustiveis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0 ;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("digite o código do produto");
		System.out.println("1 - alcool");
		System.out.println("2 - gasolina");
		System.out.println("3 - diesel");
		System.out.println("4 - fim");
		int tipo = sc.nextInt();	
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool +=1;
			} else if (tipo == 2){
				gasolina += 1;
			} else if (tipo == 3) {
				diesel += 1;
			} else {
				System.out.println("Código inválido");
			}
			System.out.println("digite 4 se deseja finalizar ");
			tipo = sc.nextInt();
			
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: "+ gasolina);
		System.out.println("Diesel: "+ diesel);
		
		sc.close();
	}
	
}
