package recapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();

		int sonuc = dortIslem.topla(5, 8);
		System.out.println("Toplama Islemi Sonuc: " + sonuc);

		sonuc = dortIslem.cikar(15, 9);
		System.out.println("Çýkarma Ýþlemi Sonuc: " + sonuc);

		sonuc = dortIslem.carp(6, 4);
		System.out.println("Çarpma Ýþlemi Sonuc: " + sonuc);

		sonuc = dortIslem.bol(72, 9);
		System.out.println("Bölme Ýþlemi Sonuc: " + sonuc);
	}
}