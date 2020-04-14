package Session_11_Exception;

import java.io.FileInputStream;

public class Checked_Unchecked_Class2 {

	public static void main(String[] args) {
		/*
		 * Checked Exceptions : Checked at Compile-Time
		 * e.g. IOException, SQLException, ClassNotFoundException etc.
		 * 
		 * Unchecked Exceptions (RunTime Exceptions): Checked at Run-Time
		 * e.g. ArithmeticException, ArrayIndexOutOfBoundsException etc.
		 */
		
		//FileInputStream x = new FileInputStream("C:\\Users\\chemb\\Downloads\\abc.txt");
		System.out.println(100/0);
		
	}

}
