import java.util.Locale;
import java.util.Scanner;

public class CodigoEPrecoDasPecas {
	static int CodigoPrimeiraPeca;
	static int CodigoSegundaPeca;
	static int QuantidadePrimeiraPeca; 
	static int QuantidadeSegundaPeca;
	static double PrecoPrimeiraPeca;
	static double PrecoSegundaPeca;
	static double ValorTotalCompra;
    
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do item: ");
	    CodigoPrimeiraPeca = sc.nextInt();
	    System.out.println("Quantidade do item: ");
	    QuantidadePrimeiraPeca = sc.nextInt();
	    System.out.println("Digite o valor do produto: ");
	    PrecoPrimeiraPeca = sc.nextDouble();
	    
	    System.out.println("Digite o código do item: ");
	    CodigoSegundaPeca = sc.nextInt();
	    System.out.println("Quantidade do item: ");
	    QuantidadeSegundaPeca = sc.nextInt();
	    System.out.println("Digite o valor do produto: ");
	    PrecoSegundaPeca = sc.nextDouble();

	    ValorTotalCompra = PrecoPrimeiraPeca * QuantidadePrimeiraPeca + PrecoSegundaPeca * QuantidadeSegundaPeca;

	    System.out.println("Valor total à pagar: " +  ValorTotalCompra);
		
		sc.close();
	}
}