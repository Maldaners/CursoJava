import java.util.Scanner;

public class TempoDeJogo {

	static int HoraInicial;
	static int HoraFinal;
	static int duracao;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora de ínicio do jogo: ");
		HoraInicial = sc.nextInt();
		
		System.out.println("Hora final do jogo:");
		HoraFinal = sc.nextInt();
		
		if (HoraInicial < HoraFinal )
		{
			duracao = HoraFinal - HoraInicial;
		} else {
			duracao = 24 - HoraInicial +  HoraFinal;
		}
		
		
		
		System.out.println("A duração total do jogo foi de " + duracao + "h");
		
		sc.close();
	}
}
