package loopDemo;

public class Main {

	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}
		System.out.println("D�ng� Bitti..");

		for(int i = 0; i <= 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Say� 2 �er artt�r�ld�.");
		System.out.println("For D�ng�s� Bitti");
		
		
		//--------------------------While D�ng�s�
		int i = 1;
		
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("While D�ng�s� Bitti");
		
		//--------------------------Do - While D�ng�s�
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		} while(j < 10);
		
		System.out.println("Do-While D�ng�s� Bitti");
	}
}