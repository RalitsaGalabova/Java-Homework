package com.hackbulgaria.qa.week1;

public class ABSumImpl implements ABSum {
	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		ABSumImpl res = new ABSumImpl();
		System.out.println(res.sum(1, 2));

	}
}
