package javaBasics;

public class Constructors1 {

	int age;
	String name;
	Constructors1(){
		this.age = 10;
		this.name = "Subbu";
	}
	Constructors1(int age, String name){
		this.age = age;
		this.name = name;
	}
	public static void main(String[] args) {
		Constructors1 cd1 = new Constructors1();
		System.out.println("Age is "+cd1.age);
		System.out.println("Name is "+cd1.name);
		
		Constructors1 cd2 = new Constructors1(15, "Venkat");
		System.out.println("Age is "+cd2.age);
		System.out.println("Name is "+cd2.name);
	}
	}

