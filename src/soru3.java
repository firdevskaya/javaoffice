import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		/*
		 * kullanicidan 50'den küçük sayi al. 1'den sayiya kadar olan tüm sayilari aþaðýdaki kurallara göre yazdýr
		 * 1) sayilar yanyana boþluklu olarak yazýlacak
		 * 2) sayý 3'e bölünüyorsa sayi yerine "Java" yazýlacak
		 * 3) 5'e bölünüyorsa sayi yerine "Ogreniyorum" yazacak
		 * 4) hem 3'e hem 5'e bölünüyorsa "Java Ogreniyorum" yazacak
		 * 5) her kelime yazýldýðýnda alt satýra geçecek
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("50'den küçük bir sayý giriniz");
		int sayi = scan.nextInt();
		
		if (sayi < 50) {
			for (int i = 1; i < sayi; i++) {
				if (i % 3 == 0) {
					System.out.println("Java");
					i++;
				}
				if (i % 5 == 0) {
					System.out.println("Ogreniyorum");
					i++;
				}
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("Java Ogreniyorum");
					i++;
				}
				System.out.print(i + " ");
			}
		} else {
			System.out.println("lütfen 50'den küçük sayý giriniz");
		}
scan.close();

	
	
	
	}

}
