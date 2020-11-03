package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Estudante {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("nome do estudante");
		student.name = sc.nextLine();
		System.out.println("nota do primeiro trimestre");
		student.grade1 = sc.nextDouble();
		System.out.println("nota do segundo trimestre");
		student.grade2 = sc.nextDouble();
		System.out.println("nota do terceiro trimestre");
		student.grade3 = sc.nextDouble();
		System.out.println("FINAL GRADE:" + student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.println("MISSING " + student.missingPoints() +" POINTS ");
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}