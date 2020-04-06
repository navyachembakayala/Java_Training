package Oops_Concept;

public class Road_Toll {
	String type;
	int tirescount;
	
	public void calculateToll () {
		if(tirescount == 2) {
			System.out.println("Toll amount is 0");
		} else if(tirescount == 4 ) {
			System.out.println("Toll amount is 10");
		} else if(tirescount > 4 ) {
			System.out.println("Toll amount is 20");
		} else {
			System.out.println("Incorrect tire count");
		}
	}

	public Road_Toll() {
		System.out.println("Constructer is executed");
	}
	
	public Road_Toll(String type, int tirescount) {
		this.type = type;
		this.tirescount = tirescount;
	}
}
