package Inheritance_Abstraction;

public interface Int1 {

	static final int a = 100;
	void dothis(); // A method which is defined by default it is an abstract method in interface, We no need to give abstract keyword to specify as abstract method
	
	static void xyz() {
		System.out.println("Static XYZ from Int1");
		
	}
	
	default void uvw() {
		System.out.println("Default UVW from Int1");
	}
}
