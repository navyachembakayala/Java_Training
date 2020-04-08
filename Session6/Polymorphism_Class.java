package Inheritance_Abstraction;

public class Polymorphism_Class {

	public static void main(String[] args) {

		Overriding_class1 c;
		
		c = new Overriding_Class2();
		c.WhoAmI();
		
		c = new Overriding_Class3();
		c.WhoAmI();

	}

}
