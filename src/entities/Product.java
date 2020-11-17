package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public Product(String name2, Double price2) {
		
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

	public String priceTag() {
		
		return null;
	}
	private Object getPrice() {
		
		return null;
	}

	protected String getName() {
		
		return null;
	}
}
