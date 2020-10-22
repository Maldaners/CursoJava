
public class EX1 {
	static String product1 = "Computer";
	static String product2 = "office desk";
	
	static int age = 30;
	static int code = 5290;
	
	static char gender = 'F';
	
	static double price1 = 2100.0;
	static double price2 = 650.50;
	static double measure = 53.234567;
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Products:");
		System.out.println(product1 + ", which price is $ "+ price1);
		System.out.println(product2 + ", which price is $ "+ price2);
				
		System.out.println("Record: "+ age + "years ould, code "+ code + " and gender: "+ gender );
		
		System.out.println("Measue with eight decimal places: "+ measure);
		System.out.printf("Measue with places:  %.2f%n" ,measure);
		
	}

}
