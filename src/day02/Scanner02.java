package day02;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan= new Scanner(System.in);
	System.out.println("lutfen final not giriniz");
	double f= scan.nextDouble() ;
	System.out.println("lutfen vize not girin");
	double v= scan.nextDouble();
	System.out.println("lutfen proje not girin");
	double p= scan.nextDouble();
        double aort =( f*50)/100+(v*30)/100+(p*20)/100;
       System.out.println("yil sonu notunuz:" + aort);


	
	
	
	
	
	
	
	
	}
}
