package Package1;

public class Assignment3 {

	public static void main(String[] args) {
		// Reverse of the string

        
		String s1 = "NAVYA";
		
		int j = s1.length() - 1;
		
		String rev = "";
				
		for ( int i = 0 ;i <= s1.length() - 1 ; i++)
		{
			rev = rev + s1.charAt(j);
			j--;
			
		}
		
		System.out.print(rev);
	}

}
