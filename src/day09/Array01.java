package day09;

public class Array01 {

	public static void main(String[] args) {
	


	// string Array i�indeki 4 harfli kelimeleri return eden method yazal�m 
	
	// [ "sali","carsamba","cuma","ctesi","pazar"]
		String [] str= { "sali","carsamba","cuma","ctesi","pzar"};
		
	dortHarfli(str);

	
	
	}
public static String []dortHarfli (String [] str){
	for (String w : str) {
		
	if(w.length()==4) {
		System.out.println(w);
	}
	
	}
	
	
	
	return str;
	
	
	

	
	}
	
	


}



