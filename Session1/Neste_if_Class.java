package Package1;

public class Neste_if_Class {

	public static void main(String[] args) {

	    int mark = 66;
	    int i2 = 10;
	    
	    if( mark >= 90)
	    {
	    	System.out.println(" A Grade");
	    } else if (mark >=75 ) {
	    	System.out.print(" B Grade");
	    } else if (mark >=60  ) {
	    	System.out.print(" C Grade");
	    } else if (mark >=40  ) {
	    	System.out.print(" D Grade");
	    } else if (mark < 40 ) {
	    	System.out.print(" FAIL ");
	    }
	}

}
