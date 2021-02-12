package day05;

import java.util.Scanner;

public class Soru01 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*ORU 1) Kullanicidan bir sayi isteyin, Girilen sayiya gore asagidaki sekli cizdiren bir method olusturun
ORNEK: 
INPUT     : satir sayisi: 10           
OUTPUT  :  1                                                                               
 12                                                                              
 123                                                                             
 1234                                                                            
 12345                                                                           
 123456                                                                          
 1234567                                                                         
 12345678                                                                        
 123456789                                                                       
 12345678910*/
		Scanner scan=new Scanner (System.in);
		System.out.println(" sekil cizmek icin bir tam sayi giriniz:");
		int sayi=scan.nextInt();
	resimCiz(sayi);
	scan.close();
	}
	
	
	
	
	public static void resimCiz(int sayi ) {
		
		
			
		
		for (int j = 1; j <= sayi; j++) {
			
		
			for (int i = 1; i <=j; i++) {
				
				System.out.print
				(i);
				System.out.println("");
				
		
				
	
				
				
			
			
			}
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
