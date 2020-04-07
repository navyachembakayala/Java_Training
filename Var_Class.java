package Session_4;

import java.util.Scanner;

public class Var_Class {

	String s3 = "";
	//var s4 = ""; var is not allowed to use in class we can only declare it in main method
	// We cannot use var at argmts of method
	public static void main(String[] args) {


		int num1 = 2;
		var num2 = 4;
		var st = "22";
		Scanner s1 = new Scanner(System.in); // declare with reference type 
		var s2 = new Scanner(System.in);     // declare it with var type
		
		int x = add(500,33);
		var y = add(22,54);
		
		System.out.println(x);
		
		
		int [] arr = new int[10];
		var arr2 = new int [10];
		int [] arr3  = {10,20,30,40,50};
 /*		var arr4 = {232,232}; if we are creating an array with intialization 
 *		we have to use old way of intialization bz it cannot identify the datatype , so we cant use
	*/	
	}
	
	public static int add(int a , int b) {
		return a+b;
	}

}
