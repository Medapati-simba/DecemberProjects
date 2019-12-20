package javaBasics;

public class Operators2 {

	public static void main(String[] args) {
		
			int num1 = -10; 		// Logical operators
			int num2 = 5;
			boolean test = false;
			if(num1 > 0 && num2 >0) {
				System.out.println("Both values are greater than 0");
			}
			else if(num1 > 0 || num2 > 0) {
				System.out.println("One of the values is greater than 0");
			}
			else {
				System.out.println("Both values are less than 0");
			}
			if(test) {
				System.out.println("It is true");
			}
			if(!test) {
				System.out.println("It is false");
			}
		}
							// comparison operator used in programing
		int num3 = 20;
		int num4 = 30; {
		
		if(num3 == num4) {
			System.out.println("Both values are equal");
		}
		
		if(num3 != num4) {
			System.out.println("The values are not equal");
		}
		
		if(num3 > num4) {
			System.out.println("Num3 is greater than Num4");
		}
		
		if(num3 < num4) {
			System.out.println("Num3 is less than Num4");
		}
		
		if(num3 >= num4) {
			System.out.println("Num3 is greater than or equal to Num4");
		}
		
		if(num3 <= num4) {
			System.out.println("Num3 is less than or equal to Num4");
		}
	
		}

	}

