package Array_Sec7;

public class ArrayOfObject {

	public static void main(String[] args) {
          Object [][] arr = 
        	      {
        	      {"ABC",22,5.3,'M'},
        		  {"HIN",35,5.8,'M'},
        		  {"Roopa",25,5.7,'F'},
        		  {"Daisy",26,5.5,'F'},
        		  };
          for(Object [] x: arr) {
        	  for(Object y: x) {
        		  System.out.print(y+ " ");
        	  }
          System.out.println("\n");
          }

	}

}
