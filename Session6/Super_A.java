package Inheritance_Abstraction;

public class Super_A  extends Super_Keyword{
	
	int n1 = 12;
	
	public void dothis() {
		System.out.println("Do this from Super A");
	}
	
	public void xyz() {
		System.out.println(super.n1);
		super.dothis();
		System.out.println("xyz executed");
	}

}
