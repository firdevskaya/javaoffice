package day2;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		

	
	
	
	
	
	
	
	
	
		//SORU 1
		//Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut kutle endeksini bulun. VKE’ni ondalikli sayi olarak yazdirin ve kullanicinin durumunu belirleyin.
		//VKE= kilo/(boy*boy)  …….. Kilo : kilogram , Boy : metre olmalidir
		//VKE<20 ise kullanici zayif
		//20<VKE<25 ise kullanici saglikli
		//25<VKE<30 ise kullanici sisman
		//30<VKE      ise kullanici obez
		//Ornek :
		// Input  :  boy :180 kilo : 80
		 //Output :  Vucut kutle endeksiniz : 24.691… sagliklisiniz}
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println(" boyunuzu giriniz (cm)");
	double boy= scan.nextDouble();
	System.out.println( "lutfen kilonuzu  giriniz (kg)");
		double kilo =scan.nextDouble();
	  
	  
		boy/=100;
		double vke= kilo/(boy*boy);
	
	
	if (vke<20) {
		System.out.println("vucut kutle indeksiniz" + vke  + ", zayifsiniz"  );
	
	}else if(vke>20 && vke<25 ) {
		
		System.out.println("vucut kutle indeksiniz" + vke  + ", sagliklisiniz"  );
	
	}else if(vke>25 && vke<30 ) {
		
	System.out.println("vucut kutle indeksiniz" + vke  + ", kilolusunuz"  );}
	
	  else {
	  System.out.println("vucut kutle indeksiniz" + vke  + ", obezsiniz"  ) ;  }
		
	}
	
	
	
	
	
	
	
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	


