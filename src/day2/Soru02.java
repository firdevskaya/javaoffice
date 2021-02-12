package day2;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		//Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun. Bir yilda kac kg seker kullandigini hesaplayip yazdirin
		// 1 seker = 1.7 gr
	//	Eger kullanici seker kullanmiyorsa (seker sayisi=0) “Cok guzel sifir seker saglikli yasam ” yazdirin
		//Ornek :
		// Input  : cay sayisi : 10 seker sayisi :2
		// Output : Yilda 12.41 kg seker kullaniyorsunuz
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" gunde kac cay icersiniz ");
		int caySayisi = scan.nextInt();
		System.out.println(" caya kac seker atarsiniz ");
		int sekerSayisi = scan.nextInt();
		double sekerTuketimi = 365*caySayisi * sekerSayisi * 1.7/1000 ;
		
		
		if(sekerSayisi==0) {
			System.out.println("Cok guzel 0 seker saglikli yasam");
		}else 
			System.out.println("Yilda " +sekerTuketimi+ "  kg seker kullaniyorsunuz");

		
		
			

	}

}
