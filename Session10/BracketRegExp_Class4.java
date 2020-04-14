package Session_10_RegExp;

public class BracketRegExp_Class4 {

	public static void main(String[] args) {
		/*
		 * 1. Adding literals in brackets [aeiou]
		 * 2. Adding ranges in brackets [A-Z0-9]
		 * 3. Usage of '^' in brackets [^a-z]
		 */
		
		String patt = "[+]dt";
		String str = "+dt";
		System.out.println(str.matches(patt));
		
		//to validate a phone number of this pattern "+1 xxx-xxx-xxxx"
		String patt7 ="[+]\\d\\s\\d{3}-\\d{3}-\\d{4}";
		String str7 = "+1 342-232-4343";
		System.out.println(str7.matches(patt7));
		
		String patt1 = "[A-za-z0-9]";
		String str1 = "c";
		System.out.println(str1.matches(patt1));
		
		String patt8 ="[+]\\d{1,}\\s\\d{1,}-\\d{1,}-\\d{1,}";
		String str8 = "+1 342-232-4343";
		System.out.println(str8.matches(patt8));
		
		
		

	}

}
