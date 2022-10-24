package staticDemoL3H2;

public class ProductValidator {
	static {
		System.out.println("Static Yap�c� blok �al��t�");
	}

	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void bisey() {

	}

	public static class BaskaBirClass {
		public static void sil() {

		}
	}
}