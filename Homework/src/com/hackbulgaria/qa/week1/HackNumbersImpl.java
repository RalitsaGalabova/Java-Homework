package com.hackbulgaria.qa.week1;

public class HackNumbersImpl implements HackNumbers {

	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static String toBinary(int x) {
		return Integer.toBinaryString(x);
	}

	public boolean isOdd(String x) {

		int count = x.length() - x.replace("1", "").length();
		if (count % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean isHack(int n) {

		String ss = toBinary(n);
		boolean verify1 = isPalindrome(ss);
		boolean verify2 = isOdd(ss);

		if (verify1 == true && verify2 == true) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public int nextHack(int n) {
		n++;
		while (isHack(n) == false) {
			n++;
		}
		return n;
	}

	public static void main(String[] args) {
		HackNumbersImpl result = new HackNumbersImpl();
		System.out.println(result.isHack(8191));
		System.out.println(result.nextHack(8031));
	}
}
