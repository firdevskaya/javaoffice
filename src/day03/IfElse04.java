package day03;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner scan= new Scanner ( System.in);
	
	// kullanicidan 3 tane pozitif tamsayi alin,
	// bu sayilarla ucgen yapilir mi yapilamaz mi kontrol edin( a+b> c >a-b , a+c>b>a-c, c+b>a>c-b
	// bu sartlari saglarsa ucgen cizilir,yoksa cizilemez
	
	
	System.out.println("ucgenin kenarlarini girin");
	int k1 = scan.nextInt();
	int k2 = scan.nextInt();
	int k3 = scan.nextInt();
	
	if(k1+k2>k3 && k1-k2<k3 || k1+k3>k2 && k1-k3<k2 || k2+k3>k1 && k2-k3<k1) {
		System.out.println("ucgen cizilir");
	}else {
		System.out.println("cizilemez");
	}
}
	
	
	
}