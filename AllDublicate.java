package practice;

import java.util.ArrayList;
import java.util.List;

public class AllDublicate {

	public static void main(String[] args) {

		AllDublicate ad = new AllDublicate();

		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List res = ad.findDuplicates(nums);
		System.out.println(res);

	}

	public List<Integer> findDuplicates(int[] nums) {

		List ls = new ArrayList();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					ls.add(nums[j]);

				}
			}
		}

		return ls;

	}
}
