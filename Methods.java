package Oops_Concept;

public class Methods {

	public static void main(String[] args) {
		// Create methods in Java and how does it return the value in a method
		
		Methods tm= new Methods();
		tm.dothis();
		tm.add(30, 13);
		int m4 = tm.mulp(10, 20);
		System.out.println(m4);
		

	}
	
	public void dothis() {
		System.out.println("This has been executed");
		
	}
	
	public void add(int n1,int n2) {
		System.out.println(n1+n2);
		
	}
	public int mulp(int m1,int m2) {
		int m3 = m1 * m2;
		return m3;
		
	}

}
