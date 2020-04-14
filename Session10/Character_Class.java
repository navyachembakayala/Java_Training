package Session_10_RegExp;

public class Character_Class {

	public static void main(String[] args) {
		 /*
		  *  1. \d - matches a single digit character
		  * 2. \w - matches a single word character
		  * 3. \s - matches a single whitespace character
		  * 4. \D - matches a single non-digit character
		  * 5. \W - matches a single non-digit and non-word character
		  */
				
		String patt = "\\d";
		String str = "6";
		System.out.println(str.matches(patt));
		
		
		String patt1 = "\\d{3}";
		String str1 = "622";
		System.out.println(str1.matches(patt1));
		
		
		String patt2 = "\\w{3}";
		String str2 = "Ac_";
		System.out.println(str2.matches(patt2));
		
		String patt3 = "\\s";
		String str3 = " ";
		System.out.println(str3.matches(patt3));
		
		String patt4 = "\\D{2,9}";
		String str4 = "%#%$^@%&!";
		System.out.println(str4.matches(patt4));
		
		String patt5 = "\\W{2,3}";
		String str5 = "#%@";
		System.out.println(str5.matches(patt5));
		
		String patt6 = "678\\d{7}";
		String str6 = "6783545435";
		System.out.println(str6.matches(patt6));
		
		String patt7 ="[+]\\d\\s\\d{3}-\\d{3}-\\d{4}";
		String str7 = "+1 343-232-4343";
		System.out.println(str7.matches(patt7));
		
		// To create the password
		
		String patt8 = "\\w{2,6}\\W{2}";
		String str8 = "rtY*(";
		System.out.println(str8.matches(patt8));
		
		
		
	}

}
