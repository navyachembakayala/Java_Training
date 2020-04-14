package Session_10_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp_Assignment2 {

	public static void main(String[] args) {
		/*
		 * Create a RegEx pattern to extract all prices from a string
		 * e.g. "Your total cost is $24.99 after $0.99 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount"
		 * RegEx pattern should be able to match all prices from the above string.
		 */
		
		String str = "Your total cost is $24.99 after $0.99 sale discount and $12.09 coupon1 discount and $0.00 coupon2 discount";
		
		String patt= "\\${1}\\d{1,}\\.\\d{1,}";
		
		Pattern p = Pattern.compile(patt);
		
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
