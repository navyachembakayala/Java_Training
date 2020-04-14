package Session_10_RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyAndLazy_Class7 {

	public static void main(String[] args) {
		/*
		 * * - Greedy	*? - Non Greedy
		 * + - Greedy	+? - Non Greedy
		 * {} - Greedy	{}? - Non Greedy
		 */
		
		String patt = "XXfduguYYshjdskfCDDXXgdfkjYYXXkkjhfYY";
		
		String patt1 = "XX.*?YY";
		Pattern p = Pattern.compile(patt1);
		Matcher m = p.matcher(patt);
		System.out.println(m.results().count());
		m.reset();
		
		while(m.find()) {
			System.out.println("starts at " + m.start());
			System.out.println(m.group());
		}
	}

}
