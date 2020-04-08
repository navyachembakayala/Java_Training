package Package1;

public class String_Conversion_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 100;
		
		System.out.println(Integer.toString(i));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toOctalString(i));
	
	   String s1 = "100";
	   String s2 = "101010";
	   
	   System.out.print(Integer.parseInt(s1));
	   System.out.print(Integer.parseInt(s2,2));
	}
	

}
