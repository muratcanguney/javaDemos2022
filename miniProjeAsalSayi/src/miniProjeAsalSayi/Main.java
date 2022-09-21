package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -50;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayý Asal Deðildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz Sayý.");
			return;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayý Asaldýr.");
		} else {
			System.out.println("Sayý Asal Deðildir.");
		}
	}
}