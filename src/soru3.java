import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		/*
		 * kullanicidan 50'den k���k sayi al. 1'den sayiya kadar olan t�m sayilari a�a��daki kurallara g�re yazd�r
		 * 1) sayilar yanyana bo�luklu olarak yaz�lacak
		 * 2) say� 3'e b�l�n�yorsa sayi yerine "Java" yaz�lacak
		 * 3) 5'e b�l�n�yorsa sayi yerine "Ogreniyorum" yazacak
		 * 4) hem 3'e hem 5'e b�l�n�yorsa "Java Ogreniyorum" yazacak
		 * 5) her kelime yaz�ld���nda alt sat�ra ge�ecek
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("50'den k���k bir say� giriniz");
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
			System.out.println("l�tfen 50'den k���k say� giriniz");
		}
scan.close();

	
	
	
	}

}
