package javaBasics;

public class Variables1 {
	
	public static void details(int age, int sno, String name) {
		System.out.println("Age is "+age+" S.No is "+sno+" Name is "+name);
	}
    
	public String names(String s1, String s2, String s3) {
		String s4 = s1 + " " + s2 + " " +s3;
		System.out.println("result of s4 "+s4);
		return s4;
	}
	public int arthmetic(int a, int b,int c ) {
		int d= a+b;
		int e = d*c;
	//	int f = e/100		// error vastunde
		int f = e-d;
		System.out.println("value of f "+f);
		return f;
	}
	public static void main(String[] args) {
		int g = 5;
		int h = 12;
		int i = 25;
		int j = 14;
		String name1 = "pavani";
		String name2 = "subbu";
		String name3 = "teja";
		
		Variables value1 = new Variables();
		Variables.add(4, 56);
		
		String name = "ranjitha";
		
		details(20,21,name);
		
		value1.addition(10,25,30);
		
		Variables1 vb1 = new Variables1();
		vb1.arthmetic(g, h, j);
		
		vb1.names(name1, name2, name3);
		
		
		
		
		
		

	}

}
