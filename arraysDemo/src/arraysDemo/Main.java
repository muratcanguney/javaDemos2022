package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Murat";
		String ogrenci2 = "U�ur";
		String ogrenci3 = "Engin";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		System.out.println("-----------------------------------------------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Murat";
		ogrenciler[1] = "U�ur";
		ogrenciler[2] = "Engin";
		
		for(int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------------------------------------------------");
		
		for(String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}
}