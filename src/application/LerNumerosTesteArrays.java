package application;

import java.util.Locale;
import java.util.Scanner;

public class LerNumerosTesteArrays {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero de valores desejados ");
		int numeroDeValores = sc.nextInt();
		double[] vect = new double[numeroDeValores]; 
		
		for (int i= 0; i< numeroDeValores; i++) {
			System.out.println("Digite o número");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0; i<numeroDeValores; i ++) {
			soma+= vect[i];
		} 
		double media = soma/numeroDeValores;
		
		System.out.println("A média é: "+ media  );
		sc.close();
	}

}
