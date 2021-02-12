package day04;

public class HMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
	/*	ORU 4) Constructor ve Method kullanim ornegi
	HM(Hesap makinasi) isimli bir class olusturun
	Icine 2 sayiyi carpan , 2 sayiyi toplayan ve sonucunu donduren 2 method
	       3 sayiyi carpan, 3 sayiyi toplayan ve sonucu yazdiran 2 method olusturun
	HMC(Hesap makinasi calistir) isimli bir class olusturun
	HM classindan object olusturarak oradaki methodlari kullanin*/
	
	
	HM hesapMakinasi= new HM();
	hesapMakinasi.carp2(2, 3);
	hesapMakinasi.carp2(5, 6);
	hesapMakinasi.topla(5, 9);
	hesapMakinasi.topla3(6, 7, 7);
	
	}

}
