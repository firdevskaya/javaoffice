package day2;

import java.util.Scanner;

public class Soru033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//	SORU 3
		//Kullanicidan iki tamsayi sayi ve islem cinsini alin ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
		//Ornek :
		// Inputs  :  sayilar : 18 , 10   islem : carpma
		// Output :  18 X 10 = 180
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki tam sayi giriniz");
		int s1=scan.nextInt();
		int s2=scan.nextInt();
		System.out.println("Bir Islem ismi giriniz : 1 :toplama 2:cikarma 3: carpma 4:bolme");
		int islem=scan.nextInt();
		
		switch (islem)
		{
		case 1 : System.out.println(s1 +" + "+ s2 + (s1+s2)  );
		break;    
		case 2 : System.out.println(s1 +" - "+ s2 + (s1-s2) );
		break;     
		case 3 : System.out.println(s1 +" x "+ s2 + (s1*s2) );
		break;	
		case 4 : System.out.println(s1 +" / "+ s2 + (s1/s2) );
		break;	
				
		default:
			System.out.println("gecerli islem numarasi giriniz");
			
			break;

	
	
	
	
	}
	}
}

