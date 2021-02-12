package day09;

import java.util.Random;
import java.util.Scanner;

public class TasKagýtMakas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	
		/*
		 Tas Kagit Makas Oyunu
		 3 tane objemiz olacak bu objlerin birbirlerine karsi ustunlukleri var
		 tas>makas
		 makas>kagit
		 kagit>tas
		 oyun kazanan sayisi 3  olursa oyun bitsin. Skoru yazdiralim.
		 */
		int numberOfFristWin =0;
		int numberOfComWin =0;
		int gameOver =3;
		Scanner input = new Scanner(System.in);
		
		while(numberOfFristWin<gameOver && numberOfComWin<gameOver) {
			
			System.out.println("1. Oyuncu Secimi: \nTas secmek icin 0\nMakas secmek icin 1"
					+ "\nKagit secmek icin 2 \nSeciniz.");
			int myGuest= input.nextInt();
			int comGuest = new Random().nextInt(3); //0 1 2
			
			System.out.println(myGuest + "\n" + comGuest);
			
			if(myGuest==comGuest) {
				System.out.println("Berabere");
			}else if ((myGuest==0 && comGuest==1) || (myGuest==1 && comGuest==2) ||(myGuest==2 && comGuest==0)) {
				System.out.println("Siz kazandiniz");
				numberOfFristWin++;
			}else {
				System.out.println("Bilgisayar Kazandi");
				numberOfComWin++;
			}
		}
		if(numberOfFristWin==3) {
			System.out.println("========Game Over=========");
			System.out.println("Siz kazandiniz" + numberOfFristWin);
			System.out.println("Bilgisayarin kazanma sayisi" + numberOfComWin);
		}else {
			System.out.println("========Game Over=========");
			System.out.println("Bilgisayar Kazandi" + numberOfComWin);
			System.out.println("Sizin kazamna sayiniz: " + numberOfFristWin);
			
		}

	
	
	
	}

}
