package Package1;

public class String_Replace_Class {

	public static void main(String[] args) {
		// Replace,replace-all
		
		String s1 = "I want to declare a 22ar";
		String s2 = "22";
		String s3 = "W";
		
		System.out.println(s1.replace(s2, s3));
	    String s4 = "Let's tell the ####world W$$%%e a@@re still aliv***e";
	    String patt = "[^A-Za-z0-9\\s]";
	    System.out.println(s4.replaceAll(patt, ""));
	}
	

}
