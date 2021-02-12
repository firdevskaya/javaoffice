package day16;

import java.util.Deque;
import java.util.LinkedList;

public class Soru8 {

	public static void main(String[] args) {
	
		
		// TODO Auto-generated method stub

	
		Deque<Integer> arr = new LinkedList<>();
		arr.add(100);
		arr.add(200);
		arr.add(250);
		arr.add(95);
		System.out.println(arr);

		arr.removeFirst();
	System.out.println(arr);
	System.out.println(arr.peek());
	}
		
		
	}


