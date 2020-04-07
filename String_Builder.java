package Session_3;

public class String_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I";
		str1 = str1 + " Love ";
		str1 = str1 + "Programming";
		System.out.println(str1);
        StringBuilder sb = new StringBuilder("I");
        sb.append(" Like");
        sb.append(" Java");
    	System.out.println(sb);
	}

}
