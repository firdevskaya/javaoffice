package day10;

import java.util.Scanner;

public class AS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("sayi gir");
		Scanner scan = new Scanner(System.in);
		int sayi= scan.nextInt();
		int sayac=0;
		int i;

		for(i=1; i<=sayi; i++) {
				if(sayi%i==0) 
					sayac++;		
		}
		if(sayac==2) {
		System.out.println("Asal");
		}
		else {
		System.out.println("Asal Deðil");
		}
	
	
	
	}

}
