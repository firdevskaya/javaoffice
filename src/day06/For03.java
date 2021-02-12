package day06;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*kullanicidan alinacak stringin her karakterini satir satir yazdiran kodu yazin
	 * 
	 * 
	 * 
	 */
	
	
	Scanner scan= new Scanner ( System.in);
	
	
	System.out.println("Luften String giriniz");
	String str= scan
			.nextLine();
	for(int i=0; i<str.length();i++) {
		System.out.println(str.charAt(i));
	
	
	
	scan.close();
		
	
		
	
	}
	
	
	
	}

}
