package Session_10_RegExp;

public class RegQuantifier_Class2 {

	public static void main(String[] args) {
		/*
		 * 1. * - Matches 0 or more instances of preceding character
		 * 2. + - Matches 1 or more instances of preceding character
		 * 3. ? - Matches 0 or 1 instances of preceding character
		 * 4. {n} - Matches exactly 'n' number instances of preceding character
		 * 5. {n,m} - Matches minimum 'n' or maximum 'm' instances of preceding character
		 * 6. {n,} - Matches minimum 'n' or more instances of preceding character
		 */

		String patt= "abc*";
		String str1="ab";
		System.out.println("abc*" + " "+ str1.matches(patt));

		String patt1= "abc+";
		String str2="ab";
		System.out.println( "abc+... atleast one c should be in str2: " + " " +str2.matches(patt1));
		
		
		String patt2= "abc?";
		String str3="ab";
		System.out.println("abc?" + " " +str3.matches(patt2));
		
		
		String patt3= "ab(ghi)?";
		String str4="ab";
		System.out.println( "ab(ghi)?" + " " +str4.matches(patt3));
		
		String patt4= "ab(ghi)+";
		String str5="ab";
		System.out.println("ab(ghi)+..atleast one (ghi) should be in str5:" + " " + str5.matches(patt4));
		
		String patt5= "ab(ghi)*";
		String str6="ab";
		System.out.println("ab(ghi)*" + " " +str6.matches(patt5));
		
		String patt6= "ab(hi){3}";
		String str7="abhihi";
		System.out.println("ab(hi){3} should have exactly 3 times (hi)" + " " +str7.matches(patt6));
		
		String patt7= "ab(hi){2,5}";
		String str8="abhihihihihihi";
		System.out.println("ab(hi){2,5} should have min 2 times and max 5 (hi)" + " " +str8.matches(patt7));

		String patt8= "ab(hi){2,}";
		String str9="abhihihihihihihihihihihihihi";
		System.out.println("ab(hi){2,} should have min 2 times and max any (hi)" + " " +str9.matches(patt8));
	}

}
