package javaBasics;

public class Example1 {
	public void display1() {
		Example e1 = new Example();
		System.out.println(e1.x);
		System.out.println(Example.y);
	}
	public static void display2() {
		Example e1 = new Example();
		System.out.println(e1.x);
		System.out.println(Example.y);
	}
}
