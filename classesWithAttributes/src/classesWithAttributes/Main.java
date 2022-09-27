package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setImageUrl("");
		product.setCode("ABC123");

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		Product product2 = new Product(2, "Laptop", "Lenovo Laptop", 6000, 5, "", "AZB678");
		productManager.add(product2);
	}
}