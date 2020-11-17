package QuartosApplication;


import java.text.ParseException;
import java.util.Scanner;

import QuartosEntities.Quartos;

public class AluguelQuartos {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Quartos[] vect = new Quartos[10];
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Cadastro #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			vect[room] = new Quartos(name, email);
		}
		System.out.println();
		System.out.println("Quartos alugados:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}
}