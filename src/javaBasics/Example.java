package javaBasics;

public class Example {
	int x = 10;
	static int y = 20;
	
	public void test1() {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void test2() {
		Example e1 = new Example();
		System.out.println(e1.x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
	}
}
