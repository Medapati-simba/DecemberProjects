package javaBasics;

public class Variables {
	
	static int id = 45; // class variables or static variables
	int value = 500;	//instance variables
	boolean result = true;	//instance variables
	static char section = 'c';	// class variables
	
	public static int add(int a, int b) {
		int c = a+b;
		System.out.println("value of c "+c);
		return c;
	}
	public static int addition(int x,int y, int z) {
		int w = x+y-z;
		return w;
	}
	
	public int add(int a,int b, int c) {
		int d = a+b+c;
		return d;
	}
	public String names(String s1, String s2) {
		String s3 = s1+" "+s2;
		return s3;
	}
	public String names(String s1, String s2, String s3) {
		String s4 = s1 + " " + s2 + " " +s3;
		return s4;
	}

	public static void main(String[] args) {
		String sa = "pavani";
		String sb = "ranjitha";
		
		
		int id = 50;
		int value = 200;
		
		System.out.println("value of id "+id);
		System.out.println("value of value variable "+value);
		
		
		// called static method without using object
		add(2,52);
		Variables value1 = new Variables();
		String sc = value1.names(sa, sb);
		System.out.println("result of sc "+sc);
		
		String sd = value1.names(sa, sb, sc);
		System.out.println("result of sd "+sd);
		
		
		
		
		 
	


	}

}
