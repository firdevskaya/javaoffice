import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		  Scanner scan= new Scanner (System.in);
			
			System.out.println("lutfen  kelime girin");
			String kelime =scan.nextLine();
			System.out.println("lutfen bir harf girin");
			String harf= scan.next().substring(0,1);
			int count =0;		
	for (int i =1 ; i <kelime.length(); i++) {
		if( kelime.substring(i, i+1).equals(harf)) {
			count ++;
		
		
		
		
		}
	}
	
	System.out.println(" girdiginiz cumlede  " + harf + " harfi  " + count  + " kere kullanilmistir");
	
	
	scan.close();
	
	
	
	}
        
}
