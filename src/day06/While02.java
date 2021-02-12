package day06;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		

		Scanner scan= new Scanner ( System.in);
		
		
		System.out.println("Luften sayi giriniz");
		int num= scan.nextInt();
		int temp =0;
		int result =0;
		
		
while (num>0) {
 temp= num%10;
 num= num/10;
 result =result*10+temp;
 
 
 
}
	
	
	
	System.out.println(result);
		
	
	
	}

}
