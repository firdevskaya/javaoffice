package day05;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

toplama();

		
	}
	
	public static void toplama ()  {
	int sayi=0;
	
	
	
	int toplam =0;
	int counter=0;
	 
	  
	do {
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner ( System.in);
		
				System.out.println(" sayi girin ");
				sayi=scan.nextInt();
				toplam+=sayi;
		counter++;
		
		
		
		
	} while (sayi!=0);
	
	System.out.println(counter + toplam);
	
	
	}
}

