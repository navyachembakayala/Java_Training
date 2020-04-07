package Session_3;

import java.util.Random;

public class Random_Class {

	public static void main(String[] args) {

        Random r = new Random();
        for(int i=1;i<=100;i++) {
        	//System.out.println(r.nextInt(100) + 900);
        	System.out.println((int)(Math.random() * 400) + 100);
        }

	}

}
