package practice;

import java.util.Arrays;
import java.util.LinkedList;

public class AddTWo_Nimbers {

	public static void main(String[] args) {
		
	sum();
}

	
	public static int sum() {
		LinkedList l1 = new LinkedList();
		
		l1.add(2);
		l1.add(4);
		l1.add(3);
		LinkedList l2 = new LinkedList();
		l2.add(5);
		l2.add(6);
		l2.add(4);
		
		Object[] arr = l1.toArray();
		Object[] arr2 = l2.toArray();
		String a = ""; 
		String b = "";
		int c =0;
		int ai=0;
		int bi=0;		
		for(int i=2;i>=0;i--)
		{
		 a = arr[i]+"";
		 b = arr2[i]+"";
		 //System.out.print(a);
		  ai = Integer.parseInt(a);
		  System.out.print(ai);
		 bi = Integer.parseInt(b);
		//System.out.print(b);	
		}
		
		c=ai[0]+bi[0];
//		System.out.print(c);
		return c; 
		
		
		
		
		
			
		}
	}