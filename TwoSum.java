package practice;

import java.util.Arrays;

public class TwoSum {
//return two index of array equal to target value
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		TwoSum ts = new TwoSum();
		int[] result = ts.sumOfIndex(nums, target);

		System.out.println(Arrays.toString(result));
	}

	static int[] sumOfIndex(int[] nums, int target) {
		// TODO Auto-generated method stub

		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}

		}
		return nums;

	}
}
