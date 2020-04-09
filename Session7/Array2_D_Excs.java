package Array_Sec7;

public class Array2_D_Excs {

	public static void main(String[] args) {


		 int [][] a = new int [5][10];
		 for(int i=2;i<=6;i++) {
			 for(int j =1;j<=10;j++) {
				 a[i-2][j-1] =i*j;
				 
			 }
		 }

		 for(int [] x:a) {
			 for (int y :x) {
				 	System.out.print(y +" ");
			 }
			 System.out.print("\n");
		 }
	}

}
