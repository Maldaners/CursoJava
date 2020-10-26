import java.util.Scanner;

public class CodigoPrecoItem {
	static int codigoProduto;
	static int quantidade;
	static double total;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Lista de produtos:");
		System.out.println("1 - Cachorro quente");
		System.out.println("2 - x-Salada");
		System.out.println("3 - X-Bacon ");
		System.out.println("4 - Torrada simples");
		System.out.println("5 - Refrigerante");
		
		
		System.out.println("Digite o código do produto");
		codigoProduto = sc.nextInt();
		System.out.println("Digite a quantidade desejada");
		quantidade = sc.nextInt();
		
		
		if (codigoProduto == 1 ) {
			total = quantidade * 4.0;
		}
		else if (codigoProduto == 2 ) {
			total = quantidade * 4.5;
		}
		else if (codigoProduto == 3 ) {
			total = quantidade * 5.0;
		}
		else if (codigoProduto == 4 ) {
			total = quantidade * 2.0;
		}
		else if (codigoProduto == 5 ) {
			total = quantidade * 1.5;
		}
		
		System.out.println("O Total à pagar é: "+ total);
		
		sc.close();
	}
	

}
