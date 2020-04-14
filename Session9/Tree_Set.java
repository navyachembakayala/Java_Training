package Sesscion9_SetsMaps;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {

		Set<String> set1 = new TreeSet<String>();
		
		set1.add("Rob");
		set1.add("Bob");
		set1.add("Andi");
		set1.add("Charlis");
		
		System.out.println(set1);
		
		var set2 = new TreeSet<Integer>();
		
		set2.add(100);
		set2.add(200);
		set2.add(300);
		set2.add(400);
		set2.add(500);

	}

}
