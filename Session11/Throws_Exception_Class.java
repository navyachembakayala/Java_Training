package Session_11_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Exception_Class {

	public static void main(String[] args) throws FileNotFoundException {

		abc();

	}
	
	public static void abc() throws FileNotFoundException {
		
		FileInputStream x = new FileInputStream("C:\\Users\\chemb\\Downloads\\abc.txt");
	}

}
