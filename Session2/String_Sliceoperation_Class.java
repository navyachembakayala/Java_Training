package Package1;

public class String_Sliceoperation_Class {
	
	public static void main(String[] args) {
		
		String s1 = "NAVYA";
			
		System.out.print(s1.charAt(3));
		System.out.print(s1.substring(2,4));	
		System.out.println(" ");
		
		String s2 = "x_y_z";
		String s3 = "_";
		String [] arr = s2.split(s3);
		for(String x:arr) {
			System.out.print(x);
		}
	}

}
