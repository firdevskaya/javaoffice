package day03;

import java.util.Scanner;

public class day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
		Scanner scan= new Scanner( System.in);

		
		System.out.println("lutfen harf giriniz");
	
	

	char ch = scan.next().charAt(0);
	System.out.println("lutfen harf giriniz");


 //  if(ch>'a'&& ch<'z') {
//	System.out.println("kucuk harf");
 //  }else if(ch>='A'&& ch<='Z') {
//	System.out.println("buyuk harf");
 //   }else {
//	System.out.println("hatali giris");

//}
   
	
   String result = ch>='a' &&ch<='z'? "Kucuk harf" :(ch>='A'&&ch<='Z') ? 
        "Buyuk harf" :    "Hatali karakter girdiniz";
System.out.println("result");
	
	
	
	
	}
}






