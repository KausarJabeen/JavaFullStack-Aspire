package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class UtilDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		//List list=new LinkedList(); 
		
		list.add("hello");
		list.add(123);
		list.add(new Suitcase(12,"aa"));
		
		System.out.println(list.get(1));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//enhanced loop
		
		for(Object o:list) {
			System.out.println(o);
		}
		
		 //List Iterator Foward
		Iterator iter=list.iterator();  
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//ListIterator Backward
		ListIterator liter=list.listIterator();
		while(liter.hasNext()) {
			System.out.println(liter.next());
		}
		while(liter.hasPrevious()) {
			System.out.println(liter.previous());
		}
	}

}
