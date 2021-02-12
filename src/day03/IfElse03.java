package day03;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		
		
		

		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayý giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if (a<b) {
			System.out.println(a+" < "+b);
		}
		if (a>b) {
			System.out.println(a+" > "+b);
		}
		if (a==b) {
			System.out.println(a+" = "+b);
		}
		if (a!=b) {
			System.out.println(a+" != "+b);
		}
		if (a<=b) {
			System.out.println(a+" <= "+b);
		}
		if (a>=b) {
			System.out.println(a+" >= "+b);
		}

}
}
