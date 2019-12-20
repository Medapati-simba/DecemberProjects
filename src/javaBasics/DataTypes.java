package javaBasics;

public class DataTypes {

	static int num2 = 56465;	//class variable
	
		byte a = 9;
		short b = 5000;
		int c = 250000;			//whole numbers
		long d = 8500000L;
		
		float frac = 58.75f;       //fraction numbers --- ending 00f/00d
		double frac2 = 5845.450d;
		
		boolean result = true; // default false
		
		String name = "narasimha reddy"; 		
		
		char c1 = 'j';
		
		public static void main(String[] args) {	
			
		int num1 = 5461;
		
		
		//Implicit casting - no action needed - small to big data type
		byte b = 25;
		int i = b; 
		
		// Explicit casting - to convert big value to small value - apply smaller data type to big datatype.
		int j = 3551;
		byte k = (byte)j; 



	}

}
