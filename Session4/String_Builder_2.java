package Session_3;

public class String_Builder_2 {

	public static void main(String[] args) {

         StringBuilder sb1 = new StringBuilder("Practise java");
         sb1.insert(13 , " daily");
         System.out.println(sb1);
         sb1.replace(13, 19, " for your understanding");
         System.out.println(sb1);
         String s1 = "ABCDEFFFGHIJFFKLMNOFFPQRSTFFUVWXYZ";
         System.out.println(s1.replace("FF", "-"));
         String s2 = "";
         String s3 = "";
         s2 = s2 + sb1.deleteCharAt(2);
         s3 = s3 + sb1.delete(8,12);
         System.out.println(s2);
         System.out.println(s3);   
         sb1.reverse();
         System.out.println(sb1);   
	}

}
