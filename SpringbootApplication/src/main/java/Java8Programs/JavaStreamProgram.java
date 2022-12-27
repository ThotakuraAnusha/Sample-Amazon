package Java8Programs;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class JavaStreamProgram {
	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "Hp Laptop", 25000f));
		productList.add(new Product(2, "Dell Laptop", 45000f));
		productList.add(new Product(3, "Apple Laptop", 87000f));
		productList.add(new Product(4, "Lenovo Laptop", 56000f));
		productList.add(new Product(5, "Sony Laptop", 34000f));
		productList.add(new Product(6, "Samsung Laptop", 67000f));
		productList.add(new Product(7, "vivo Laptop", 23000f));
		productList.add(new Product(8, "Oneplus Laptop", 78000f));

		List<Float> productPriceList = new ArrayList<Float>();

		for (Product product : productList) {
			// Filtering Data List

			if (product.price < 35000) {
				productPriceList.add(product.price); // adding price to a product price list
			}
		}

		System.out.println(productPriceList); // displaying data

	}
}
