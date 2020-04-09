package Array_Sec7;

public class Dimension_2Array {

	public static void main(String[] args) {
		
		String [][] arr= {{"a","N","F"},{"AD","DF"},{"ASD","DES","RSA","DEE"}};
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		System.out.println(arr[2][2]);
		
		for(String[] x: arr) {
			for(String y : x) {
				System.out.println(y);
			}
			System.out.println("--------------------");
		}
	}

}
