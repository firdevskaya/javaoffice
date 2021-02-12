package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {

	public static void main(String[] args) {
		

		/*//ArrayList i Array e ceviren java kodu yaziniz.
        //"Python", "JAVA", "PHP",  "Perl",  "C++"*/

		
		 

	
	List<String> list = new ArrayList<>();
	list.add("Python");
	list.add("JAVA");
	list.add("PHP");
	list.add("Perl");
	list.add("C#");
	list.add("C++");
			
	 
	
	 String [] arr =new String [list.size()];
	 list.toArray(arr);
	
	System.out.println(Arrays.toString(arr));
	 

	Arrays.sort(arr);
	 
	
	System.out.println(Arrays.toString(arr));
}
}