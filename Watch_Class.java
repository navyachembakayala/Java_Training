package Oops_Concept;

public class Watch_Class {

	public static void main(String[] args) {


		Watch w1 = new Watch();
		w1.Color = "Grey";
		w1.Brand = "Tommy";
		w1.type = "Digital Watch";
	//	w1.model = "Ch";
				
		w1.displayDetails();
		
		Watch w2 = new Watch();
		//w2.Color = "Grey";
		w2.Brand = "MK";
		w2.type = "Chrono Watch";
		w2.model = "Leather Strip";
				
		w2.displayDetails();
		

	}

}
