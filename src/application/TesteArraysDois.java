package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.Produto;

public class TesteArraysDois {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero de valores desejados ");
		int numeroDeValores = sc.nextInt();
		Produto[] vect = new Produto[numeroDeValores];
		
		for (int i= 0; i<vect.length; i++) {
			sc.nextDouble();
			System.out.println("Digite o nome do produto");
			String name = sc.nextLine();
			System.out.println("digite o preço");
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
			
		}
		
		double soma = 0.0;
		for (int i=0; i<vect.length; i++) {
			soma += vect[i].getPrice();
		}
		double media =  soma / vect.length;
		
		System.out.println("Média de preços: " + media);
		sc.close();
	}

}
