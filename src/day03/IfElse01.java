package day03;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner( System.in);

	
		System.out.println("yaþýnýzý giriniz");
		byte yas= scan.nextByte();
		System.out.println("kilonuzu giriniz");
		int kilo= scan.nextInt();
		
		//if (yas<18) {
			System.out.println("kan baðýþý yapamaz");
	//	}else if (kilo<50) {
			System.out.println("kan baðýþý yapamaz");
		//}else {
		//	System.out.println("kan baðýþý yapabilr");

//	scan.close();
			
	
		
String result=	yas >=18 ? kilo >50? "kan bagisi yapabilir ": "5o kg dan az olanlar kan bagisi yapamaz "
		:"18 yasindan kucukler kan bagisi yapamaz ";
		System.out.println(result);
		}
		
	
	
	
	
	
	
	
	}


