package Package1;

public class String_Comparision_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "NAVYA";
		String s2 = "navya";
		
		System.out.println(s1.equals(s2));
		
		String s3 = "NAVYA";
		String s4 = "navya";
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		if(s1.equals(s2))
		{
			System.out.println("String is equal");
		} else {
			System.out.println("String is not equal");
		}
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		String pattern = "[A-Z]{1,}";
		System.out.println(s1.matches(pattern));
	}

}
