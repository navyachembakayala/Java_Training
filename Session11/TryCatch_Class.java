package Session_11_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//checked and unchecked exceptions can use try and catch 
public class TryCatch_Class {

	public static void main(String[] args) {
		abc();

	}
	
	public static void abc() {
		try {
			FileInputStream x = new FileInputStream("C:/Users/chemb/Downloads/abc.txt");
		} catch (FileNotFoundException e) { //subclass should come first before declaring the generic exceptions
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (Exception e1) { //Putting more specific exception once than generic one
			System.out.println(e1.getMessage());
		}
	}

}
