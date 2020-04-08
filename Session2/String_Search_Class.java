package Package1;

public class String_Search_Class {

	public static void main(String[] args) {
		// contains,starts with,Ends with,Index of,last index of - search in reverse order

		String s1 = "I am in attra in";
		String s2 = "Attra";
		
		System.out.println(s1.contains(s2));
		System.out.println(s1.toUpperCase().contains(s2.toUpperCase()));
		System.out.println(s1.startsWith("I am"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.indexOf("in"));
		System.out.println(s1.indexOf("in",6));
		System.out.println(s1.lastIndexOf("in"));
	}

}
