package Session_10_RegExp;

public class REgExp_Assignment1 {

	public static void main(String[] args) {

		/*
		 * Create a RegEx pattern to represent following web sites
		 * 1. www.dezlearn.com
		 * 3. www.dezlearn.us
		 * 2. www.dez.com
		 * 3. www.dez.us
		 */
		
		String patt = "www\\.(dezlearn|dez)\\.(com|us)";
		String str1 = "www1dez.us";
		
		System.out.println(str1.matches(patt));
	}

}
