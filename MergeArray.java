package practice;

import java.util.Arrays;

public class MergeArray {
// find median of two sorted Array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeArray ma = new MergeArray();

		int[] arr1 = { 8, 2, 3, 9 };
		int[] arr2 = { 5, 6, 7 };
		int[] result =ma.mergeArr(arr1, arr2);
		Arrays.sort(result);
		for(int i=0;i<result.length;i++)
		{
		System.out.println(result[i]);	
		}
	}

	private int[] mergeArr(int[] arr1,int[] arr2) {
		// TODO Auto-generated method stub
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] result = new int[n1 + n2];

		for(int i=0;i<n1;i++)
		{
			result[i]=arr1[i];
			
		}
		for(int j=0;j<n2;j++)
		{
			result[n1+j]=arr2[j];
		}
		return result;
	}
}
