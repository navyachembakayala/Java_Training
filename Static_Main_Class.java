package Oops_Concept;

public class Static_Main_Class {

	public static void main(String[] args) {
	
		Static_Keyword s1 = new Static_Keyword();
		Static_Keyword s2 = new Static_Keyword();
		
		s1.age = 7;
		s1.grade = "2nd";
		Static_Keyword.name = "Sam";
		Static_Keyword.doThis();
		
		
		s2.age = 8;
		s2.grade = "1nd";
		s2.name = "Nav";
		
		s1.getdetails();
		s2.getdetails();
		

	}

}
