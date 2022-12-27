package Java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class StreamProgramExample1 {
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

		List<Float> productPriceList2 = productList.stream().filter(p->p.price <30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(productPriceList2);


}
}
