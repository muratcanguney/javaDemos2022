package classesWithAttributesL3H2;

public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String imageUrl;
	private String code;

	public Product() {
		System.out.println("Parametresiz Constructor çalıştı..");
	}

	public Product(int id, String name, String description, double price, int stockAmount, String imageUrl, String code) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.imageUrl = imageUrl;
		this.code = code;

		System.out.println("Parametreli Constructor çalıştı..");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}