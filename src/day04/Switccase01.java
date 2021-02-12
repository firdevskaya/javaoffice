

package day04;

import java.util.Scanner;

public class Switccase01 {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

	
		
		 /*
         * Kullanicinin girmis oldugu 1 ile 5 arasindaki not karsiligini yazdiralim
         * 5 pekiyi
         * 4 iyi
         * 3 orta
         * 2 gecer 
         * 1 kaldi
         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir rakam girin");
		int sayi=scan.nextInt();
		

		switch(sayi){
		case 5 :
		System.out.println("pekiyi");
			break;
		case 4:
			System.out.println("iyi");
			break;
		case 3:
			
      System.out.println(" orta");
	
		case 2 :
		System.out.println("gecer");
			break;
		case 1:
		
			System.out.println("kaldi");
			break;
		default :
System.out.println(" lutfen gecerli gun giriniz");
		
		
		}	
	}

}
