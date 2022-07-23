package practice;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] nums= {1,2,3,4,5,6,7};
	int k=3;
	int n=nums.length;
	int[] Arr = new int[n];
	Arr[0]=nums[n-3];
	Arr[1]	=nums[n-2];
	Arr[2]	=nums[n-1];
	Arr[3]=nums[0];
	Arr[4]=nums[1];
	Arr[5]=nums[2];
	Arr[6]=nums[3];
	System.out.println(Arrays.toString(Arr));
			
	}

}
