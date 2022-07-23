package practice;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		SelectionSort ss = new SelectionSort();
		int[] result = ss.selectionSortArr(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
		
		
		

	}

	private int[] selectionSortArr(int[] arr) {
		int n=arr.length;
		
	for(int i=0;i<n-1;i++)
	{
		int min_index=i;
	for(int j=i+1;j<n;j++)
	
		if(arr[j]<arr[min_index])
		
			min_index=j;
		int temp=arr[min_index];
		arr[min_index]=arr[i];
		arr[i]=temp;
	}
	
	
	return arr;
	}

}
