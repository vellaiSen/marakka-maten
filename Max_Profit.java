package practice;

import java.util.Arrays;

public class Max_Profit {

	public static void main(String[] args) {

		int[] price = { 7, 6, 5, 4, 3, 1 };

		int maxProfit = findMax_Profit(price);
		System.out.println(maxProfit);
	}

	private static int findMax_Profit(int[] price) {
		if(price.length==0||price.length==1)
			return 0;
		int maxProfit = 0;
        int minValue = price[0];
		for (int i = 0; i < price.length; i++) {
			
		minValue = Math.min(minValue, price[i]);
		maxProfit = Math.max(maxProfit, price[i]-minValue);
			
		}

		return maxProfit;
	}
	
}
