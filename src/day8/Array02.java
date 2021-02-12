package day8;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array elemanlarini siralayan java kodu yaziniz.
        //12,1,5,15,18,9}


	
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
	
		int sum=0;
//		for (int i : arr) 
//			sum+=i;
		
		for (int i = 0; i < arr.length; i++) {
			
			sum+=arr[i];
			
		}
		System.out.println("Array Toplami:" + sum);

	
	}
}