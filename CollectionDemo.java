package practice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CollectionDemo {
	 
public static void main(String arg[])

{
	List<ArrayList<String>> a = new ArrayList<>(); 

	ArrayList<String> al1 = new ArrayList<String>();
	ArrayList<String> al2 = new ArrayList<String>();
	ArrayList<String> al3 = new ArrayList<String>();

	al1.add("zara");
	al1.add("2");


	al2.add("ravi");
	al2.add("3");


	al3.add("zara");
	al3.add("4");


	a.add(al1);
	a.add(al2);
	a.add(al3);
	findBestAverage(a);	    
}



public static void findBestAverage(List<ArrayList<String>> a) {
	Map<Object, Object> myMap = new HashMap<>();
	int addCount = 0;
	for(ArrayList<String> stu : a) {
		if(myMap.containsKey(stu.get(0))) {
			String zara_val = (String) myMap.get(stu.get(0));
			String existingVal = stu.get(1);
			int newValue = Integer.parseInt(zara_val) + Integer.parseInt(existingVal) ;
			
			 addCount++;
			//findAverage
			int count = stu.size();
			int average_val = newValue/addCount; // (sum of two values/2)
			System.out.println("This is if condition " + average_val);
			myMap.put(stu.get(0), average_val);
			System.out.println(myMap);
		}
		else {
			myMap.putIfAbsent(stu.get(0), stu.get(1));
			System.out.println("This is else condition");
			System.out.println(myMap);			
		}
	}
}
}