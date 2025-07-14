package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractise {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//operations
		
		list.add("shaheen");
		list.add("shabana");
		list.add("shaiksha");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		System.out.println(list.set(0,"shamma"));
		System.out.println(list);
		
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		System.out.println(list.contains("shabana"));
		System.out.println(list.size());
		
		
	}
}
