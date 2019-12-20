package javaBasics;

public class DetailStudents {
	static int noofBooks = 5;
	String review = "good";
	 int id = 54;
	 char grade = 'b';
	
 public String fullname(String a,String b) {
	 String c= a+" "+b;
	 System.out.println("full names "+c);
	 return c;
 }
  public static void main(String[] args) {
	  String name = "max";
	  String name2 = "Reddy";
	
	DetailStudents ds1 = new DetailStudents();
	
	 System.out.println("id of ds1 "+ds1.id);
	 System.out.println("Total no of books "+DetailStudents.noofBooks);
	 System.out.println("Review of student "+ds1.review);
	 System.out.println("obtained grades "+ds1.grade); 
	 
	StudentDetails std3= new StudentDetails();
	std3.grades='b';
	std3.id= 758;
	
	StudentDetails std4 = new StudentDetails();
	std4.section = 'c';
	std4.name = "max";
	
	String fullname = ds1.fullname(name, name2);
	
	System.out.println("obtained grades "+std3.grades);
	System.out.println("id of std3 "+std3.id);
	System.out.println("section of std4 "+std4.section);
	System.out.println("name of student "+std4.name);
	
	
  }
	
	
	 

}
