import java.util.Locale;
import java.util.Scanner;

public class CalculaSalarioFuncionario {
	static int NumeroFuncionario;
	static int HorasTrabalhadas;
    static double ValorPorHora;
    static double SalarioFinal;
    
    
    
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
	    System.out.println("Digite o N�mero do Funcion�rio: ");
	    NumeroFuncionario = sc.nextInt();
	    
	    System.out.println("Quanto o funcion�rio recebe por Hora? ");
	    ValorPorHora = sc.nextDouble();
	    
	    System.out.println("Digite o total de horas trabalhadas do Funcion�rio: ");
	    HorasTrabalhadas= sc.nextInt();
	    
	   
	    SalarioFinal =ValorPorHora * HorasTrabalhadas;

	    System.out.println("N�mero do funcion�rio: " + NumeroFuncionario);
	    System.out.println("Sal�rio do funcion�rio: "+ SalarioFinal);
		
		sc.close();
	}
}