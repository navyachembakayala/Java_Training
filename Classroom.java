package Oops_Concept;

public class Classroom {
        
	String Subject;
	int Stud_count;
	
	private String Sub;
	private int Student_count;
	
	
	
	public String getSub() {
		return Sub;
	}



	public void setSub(String sub) {
		Sub = sub;
	}



	public int getStudent_count() {
		return Student_count;
	}



	public void setStudent_count(int student_count) {
		Student_count = student_count;
	}



	public void displaydetails() {
		System.out.println("This is a " + Subject + " Classroom and it has " + Stud_count + " students");
		
	}
	
	public void displaydetails1() {
		System.out.println("This is a " + Sub + " Classroom and it has " + Student_count + " students");
	}
}
