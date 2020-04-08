package Oops_Concept;

public class Access_Specifier {
       /* Public
        * Private
        * Default
        * Protected
        */
	
	public int n1 = 22;
	int b =30;
	private int c = 300;
	
	public void public_access() {
		System.out.println("Public method");
	}
	
	private void private_access() {
		System.out.println("Private method");
	}
	
	void default_access() {
		System.out.println("Default method");
	}
	
}
