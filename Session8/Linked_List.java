package Array_Sec8;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {

		var list = new LinkedList<Double>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
//		System.out.println(list.get(3));
//		list.add(2, 1.25);
//		list.set(2, 1.3);
//		//list.clear();
//		//list.remove(1.6);
//		list.add(1.7);
//		list.add(4, 1.35);
//		
//		System.out.println(list.indexOf(1.3));
//		System.out.println(list.lastIndexOf(1.3));
//		System.out.println(list.contains(90.0));
//		
		System.out.println(list.peekFirst()); // display head of the list
		System.out.println(list.peekLast());// display the tail of the list
		System.out.println(list.pollFirst());//remove first value from the list
		System.out.println(list.pollLast()); // remove the last value from the list
		
		System.out.println("----------------");
 		System.out.println(list);
//		
//		System.out.println("----------------");
//		System.out.println(list.subList(2, 5));
		
	}

}
