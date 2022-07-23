package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMax {

	public static void main(String[] args) {
		int[] nums = { 2, 1 };
		FindMax fm = new FindMax();
		fm.thirdMax(nums);

	}

	private int thirdMax(int[] nums) {

		Set<Integer> setNums = new HashSet<Integer>();
		for (int i : nums) {
			setNums.add(i);

		}
		int maxValue = Collections.max(setNums);
		if (setNums.size() < 3) {
			System.out.println(maxValue);
		} else {

			setNums.remove(maxValue);
			int secondMax = Collections.max(setNums);
			setNums.remove(secondMax);

		}
		return Collections.max(setNums);

	}

}
