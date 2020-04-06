package Oops_Concept;

public class Method_Overloading {
	
	/* method overloading - can have same method names but pass with different arguments 
	 * 
	 */
	
	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void addition(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	public void addition(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	public void addition(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
}
