package by.htp.oop05_task02.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Payment {
	
	private List<Product> products;
	
	public Payment() {
		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product... product) {
		for (int i = 0; i < product.length; i++) {
			products.add(product[i]);
		}
	}	
	
	public int calculateTotalPayment() {		
		int sum = 0;		
		for (Product p : products) {
			sum += p.getPrice();
		}
		return sum;
	}
	
	public List<Product> getProducts() {
		return products;
	}	
	
	public static class Product {
		
		private String name;
		private int price;
		
		public Product() {}
		
		public Product(String name, int price) {
			this.name = name;
			this.price = price;
		}
		
		public String getName() {
			return name;
		}
		
		public int getPrice() {
			return price;
		}		

		@Override
		public String toString() {
			return getClass().getSimpleName() + "[name: " + getName() + ", price: " + getPrice() + "]";
		}		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(products, other.products);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[products: " + getProducts();
	}
}

