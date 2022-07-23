package practice;

import java.util.Arrays;

public class FirstAndLast_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 5, 7, 6, 8, 8, 9 };
		int target = 8;
		int[] result = findIndex(nums, target);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findIndex(int[] nums, int target) {
		int[] res = new int[2];

		int firstIndex = -1;
		int lastIndex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target && firstIndex == -1) {
				firstIndex = i;
				res[0] = firstIndex;
			}
			if (nums[i] == target && firstIndex != -1) {
				lastIndex = i;

				res[1] = lastIndex;
			}

		}

		return res;
	}

}
