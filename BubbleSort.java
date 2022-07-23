package practice;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 64, 34, 25, 12, 22, 11, 90  };
		BubbleSort bs = new BubbleSort();
		int[] result = bs.bubbleSortArr(arr);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}

	}

	private int[] bubbleSortArr(int[] arr) {
		
	int n=arr.length;
	for(int c=0;c<n-1;c++)	
	{
	for(int j=0;j<n-c-1;j++)	
	{
		if(arr[j]>arr[j+1])
		{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
	}
	}
		
	return arr;	
		
		
	}

}
