package methods2;

public class Main {

	public static void main(String[] args) {
		String yeniMesaj = sehirGetir();
		System.out.println(yeniMesaj);

		int sayi = topla(5, 7);
		System.out.println("Toplam: " + sayi);

		int toplam = topla2(2, 4, 6, 8);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi..");
	}

	public static void sil() {
		System.out.println("Silindi..");
	}

	public static void guncelle() {
		System.out.println("G�ncellendi..");
	}

	public static String sehirGetir() {
		return "Eski�ehir";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;

		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}

		return toplam;
	}
}