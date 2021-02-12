package day04;

public class Multidýamondsoru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*SORU 5) Girilen Multidimensional arraydeki cift sayilari toplayan bir method yaziniz
INPUT    :  {{1,3,6},{2,8},{5,7,9,10}}
OUTPUT : Arraydeki cift sayilarin toplami : 26*/
	
	

		
		int array[][]={{1,3,6},{2,8},{5,7,9,14}};
		ciftSayilar(array);
	}
	
	
	public static void ciftSayilar(int array[][]) {
		
		int toplam=0;
	     for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j]%2==0) {
					toplam+=array[i][j];
				}
				
				
			}
			
		} System.out.println("cift elemanlarin toplami = " + toplam);
	
	
	
	
	
	
	}
	
	
}
