package Package1;

public class String_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Navya";
		String str2 = "Senior Software engineer";
		
		String Str3 = str1 +str2;
		System.out.println(Str3);
		
		String str4 = str1.concat(str2);
		System.out.println(str4);
		
		int n1=100;
		System.out.println(str1 + n1);
		System.out.println(Str3.length());
		
		
		String str5 = "         salary is increased         ";
		System.out.println(str5.trim());
		System.out.println(str5.toUpperCase());
		System.out.println(str5.toLowerCase());
		System.out.println(str2.isEmpty());
		
		String Empt = "";
		
		System.out.println(Empt.isEmpty());
	}

}
