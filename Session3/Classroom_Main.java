package Oops_Concept;

public class Classroom_Main {

	public static void main(String[] args) {
		
		Classroom cs = new Classroom();
		cs.Stud_count = 24;
		cs.Subject = "Maths";
		cs.displaydetails();
		
		Classroom cs1 = new Classroom();
		cs1.setSub("Physics");
		cs1.setStudent_count(60);
		cs1.displaydetails1();
	}

}
