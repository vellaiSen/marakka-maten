package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
//System.out.println(a);

HashMap<String,Integer> map = new HashMap();
String[] arr = new String[5];
arr[0]="zara";
arr[1]="2";
arr[2]="ravi";
arr[3]="3";
arr[4]="4";
for(int i=0;i<arr.length;i++)
{
	

System.out.println(arr[i]);
}
for (String s:arr)
{
	if(map.containsKey("zara"))
	{
		map.put("zara", map.get("zara")+map.get("zara"));
	}
	else
	{
		map.put("zara", map.get("zara"));
	}
}
//System.out.println(map);
Set<Map.Entry<String,Integer>> set=map.entrySet();
for(Map.Entry<String,Integer> entry:set)
{
//System.out.println(entry.getKey() +"" +entry.getValue());	
}




}
}