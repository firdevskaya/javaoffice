package day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SORU3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hSet = new HashSet<String>();
        hSet.add("red");
        hSet.add("green");
        hSet.add("orange");
        hSet.add("white");
        System.out.println("Hash Set: " + hSet);

		List<String >arr= new ArrayList(hSet);
		System.out.println(hSet);
		
	}

}
