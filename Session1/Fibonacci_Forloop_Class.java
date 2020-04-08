package Package1;

public class Fibonacci_Forloop_Class {

	public static void main(String[] args) {
		// find first 20 number fibonacci
		
		int i1 = 0;
		int i2= 1;
		int i3 = 0;
		
		System.out.println(i1);
		System.out.println(i2);
		for(int i = 1; i<=18; i++) {
			
			i3 = i1+i2;
			System.out.println(i3);
			i1 = i2;
			i2 = i3;
		}
			
	}

}
