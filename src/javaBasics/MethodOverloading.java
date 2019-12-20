package javaBasics;

public class MethodOverloading {
		
		public static void details(int age, String name) {
			System.out.println("Age is "+age+" Name is "+name);
		}
		public static void details(int age, int sno, String name) {
			System.out.println("Age is "+age+" S.No is "+sno+" Name is "+name);
		}
		public static void details(int a, int b) {
			System.out.println("a is "+a+" b is "+b);
		}
		public static void details(String a, String b) {
			System.out.println("a is "+a+" b is "+b);
		}
		public static void details1(int age, String name) {
			System.out.println("Age is "+age+" Name is "+name);
		}
		public static void details1(String name, int age) {
			System.out.println("Age is "+age+" Name is "+name);
		}
		public static void main(String[] args) {
			details(20, "narasimha");					// Different arguments
			details(23, 123, "Ranjitha");
			
			details(25, 30);
			details("narasimha", "ranjitha");			// Different Argument types
			
			details1(20, "narasimha");
			details1("ranjitha", 22);						// different sequence 
		
		}	
}
		
			--


