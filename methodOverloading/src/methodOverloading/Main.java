package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println("�ki Sayili Toplam: " + dortIslem.topla(9, 2));
		System.out.println("�� Sayili Toplam: " + dortIslem.topla(9, 2, 3));
	}
}