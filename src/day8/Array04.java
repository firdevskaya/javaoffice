package day8;

import java.util.Scanner;

public class Array04 {
	//Kullanicadan 5 tane sayi alalim bu sayilari bir array icerisine atalim.
    // içlerindeki cift sayilarin sayisini bulacagiz.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		int [ ] arr= new int [5] ;
		int count=0;
				 Scanner scan= new Scanner (System.in);
				 for (int i = 0; i < 5; i++) {
					 System.out.println(i + " inci elamani giriniz");
					 arr[i]=scan.nextInt();
				}
				 for (int i = 0; i < 5; i++) {
					 if(arr[i]%2==0) {
						count++;
					 }
				}
				 System.out.println(count);
	
	
	/*
	
	
	
	
	
	//Kullanicadan 5 tane sayi alalim bu sayilari bir array icerisine atalim.
		// içlerindeki cift sayilarin sayisini bulacagiz.
		
		Scanner input =new Scanner(System.in);
		System.out.println("Lutfan 5 tane sayi giriniz.");
		int[] nums= {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		
		int count=0;
		
		for (int i : nums) {
			if(i%2==0) {
				count++;
			}
			
		}
		System.out.println("Girilen sayilardaki cift sayi adedi: " + count);

	*/
	
	}

}
