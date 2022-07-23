package practice;

public class ReverseNumber {

	public static void main(String[] args) {
		int x = 121;

		findReverse(x);

	}

	private static void findReverse(int x) {

		int rem, rev = 0, temp;
		int n = 121; // user defined number to be checked for palindrome

		// temp = n;

		// reversed integer is stored in variable
		while (n != 0) {
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}

		// palindrome if orignalInteger(temp) and reversedInteger(rev) are equal
		if (n == rev)
			System.out.println(n + " is a palindrome.");
		else
			System.out.println(n + " is not a palindrome.");
	}

}
