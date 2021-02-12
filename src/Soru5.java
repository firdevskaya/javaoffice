import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan= new Scanner ( System.in);
	
	System.out.println("lutfen bir sayi girin");
	int number = scan.nextInt();
	
	int bolenlerintop=0;
	for (int i = 1; i < number; i++) {
		if (number %i==0) {
			bolenlerintop+=i;
		}
	}
	
	if (bolenlerintop==number ) {
		System.out.println("mukemmel sayi ");
	}else {
		System.out.println("mukemmel sayi degil"
				+ "");
	}
	
	
	scan.close();

	
	
	}

}
