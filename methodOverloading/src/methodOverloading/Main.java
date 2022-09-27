package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println("Ýki Sayili Toplam: " + dortIslem.topla(9, 2));
		System.out.println("Üç Sayili Toplam: " + dortIslem.topla(9, 2, 3));
	}
}