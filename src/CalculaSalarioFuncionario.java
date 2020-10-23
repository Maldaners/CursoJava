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

		
	    System.out.println("Digite o Número do Funcionário: ");
	    NumeroFuncionario = sc.nextInt();
	    
	    System.out.println("Quanto o funcionário recebe por Hora? ");
	    ValorPorHora = sc.nextDouble();
	    
	    System.out.println("Digite o total de horas trabalhadas do Funcionário: ");
	    HorasTrabalhadas= sc.nextInt();
	    
	   
	    SalarioFinal =ValorPorHora * HorasTrabalhadas;

	    System.out.println("Número do funcionário: " + NumeroFuncionario);
	    System.out.println("Salário do funcionário: "+ SalarioFinal);
		
		sc.close();
	}
}