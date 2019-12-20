package javaBasics;

public class StudentDetails {
	int id = 4;
	char section = 'c';
	String name = "narasimha";
	char grades;
	
	
	public int marks(int a, int b ,int c) {
		 int d = a+b+c;
		 return d;
	}	 
	public int percent(int x,int y)	{
		int z = x/y;
		int w = z*100;
		return w;
		
	}
	public static void main(String[] args) {
		int tel = 80;
		int hindi = 75;
		int eng = 80;
		int obtained = 235;
		int total = 300;
		
		StudentDetails std1 = new StudentDetails();
		std1.id = 24;
		std1.name = "raviKumar";
		
		StudentDetails std2= new StudentDetails();
		std2.id = 56;
		std2.name = "kiran";
		
		int languages= std1.marks(tel, hindi, eng);
		int percentage = std1.percent(obtained, total);
		
		System.out.println("no of id in std1"+std1.id);
		System.out.println("name in std1 "+std1.name);
		System.out.println(" marks of languages  "+ languages);
		System.out.println("Total percentage "+ percentage);
		System.out.println("no of id in std2 "+std2.id);
		System.out.println("name in std2 "+std2.name);
		
	}
		
 
}
