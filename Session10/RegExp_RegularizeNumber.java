package Session_10_RegExp;

public class RegExp_RegularizeNumber {

	public static void main(String[] args) {
		/*
		 * Create a RegEx pattern to represent following number ranges
		 * 1. 0-99
		 * 2. 0-1000
		 * 3. 99-9999
		 * 4. 25-75
		 * 5. 220-240
		 */
		
		String patt = "[0-9][0-9]?";
		String str1 = "45";
		System.out.println(str1.matches(patt));
		
		String patt1 = "[0-9][0-9]?[0-9]?|1000";
		String str2 = "999";
		System.out.println(str2.matches(patt1));
		
		String patt2 = "99|[1-9][0-9][0-9][0-9]?";
		String str3 = "2993";
		System.out.println(str3.matches(patt2));
	
		String patt3= "2[5-9]|[3-6][0-9]|7[0-5]";
		String str4 = "27";
		System.out.println(str4.matches(patt3));
		
		String patt4= "2[2-3][0-9]|240";
		String str5 = "240";
		System.out.println(str5.matches(patt4));
		
		
	}

}
