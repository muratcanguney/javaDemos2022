package loopDemo;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti..");

		for(int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Sayý 2 þer arttýrýldý.");
		System.out.println("For Döngüsü Bitti");
		
		
		//--------------------------While Döngüsü
		int i = 1;
		
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("While Döngüsü Bitti");
		
		//--------------------------Do - While Döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		} while(j < 10);
		
		System.out.println("Do-While Döngüsü Bitti");
	}
}