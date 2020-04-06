package Oops_Concept;

public class Roadtoll_Main_Class {

	public static void main(String[] args) {
		Road_Toll rt = new Road_Toll();
		rt.type="SUV";
		rt.tirescount = 4;
		rt.calculateToll();
		
		Road_Toll rt2 = new Road_Toll("Truck", 6);
        rt2.calculateToll();
	}

}
