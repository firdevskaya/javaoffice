import java.util.Scanner;

public class Sorudowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	
	
	
	
	
		/*
		 * Bir say�n�n m�kemmel olup olmad���n� bulan bir program yaz�n�z.
		 * 
		 * 
		 * M�kemmel say� : bir say�n�n kendisi hari� b�lenlerinin toplam�, kendisine
		 * e�itse o say� m�kemmeldir.
		 * 
		 * ORNEK:
		 * 
		 * INPUT : 6
		 * 
		 * OUTPUT : 1,2,3 1+2+3 = 6 = 6 (M�kemmel)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=scan.nextInt();
		
		int bolenlerinToplami=0;
		
		int bolenKontrol=1;
		do {
			if (number%bolenKontrol==0) {
				bolenlerinToplami+=bolenKontrol;
			}
		bolenKontrol++;
		}
			while (bolenKontrol==0);
		

	
		
		if (bolenlerinToplami==number) {
			System.out.println(number + " mukemmel sayi");
		} else {
			System.out.println(number + " mukemmel sayi degil");}
	
	scan.close();
	
	}
}
