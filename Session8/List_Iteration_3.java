package Array_Sec8;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iteration_3 {

	public static void main(String[] args) {

		var list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(11);
		list.add(23);
		list.add(100);
		list.add(30);
		list.add(111);
		list.add(119);

		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) {
			int i = (int) itr.next();
			if(i % 2 == 1 ) {
				i++;
				itr.set(i);
				
			}
		}
			System.out.println(list);
	}
	

}
