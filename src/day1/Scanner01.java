package day1;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

// kullaniciden 2 tam sayialalim 4 i�lem sonucunun ekrana yazal�m
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" iki tam sayi yaziniz");
		  double a1 = scan.nextDouble();
		  double a2= scan.nextDouble();
		  double toplam = a1+a2;
		  
		  double fark= a1-a2;
		  double bol =a1/a2;
		  double carp= a1*a2;
				  System.out.println("toplam: "  +fark+ "c�kartma:" +fark+  "bolum:" +bol+ "carpim:" +carp);
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
