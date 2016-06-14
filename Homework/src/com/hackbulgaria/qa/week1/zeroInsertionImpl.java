package com.hackbulgaria.qa.week1;

import java.util.ArrayList;

public class zeroInsertionImpl implements ZeroInsertion {
	@Override
	public String zeroInsertion(int n) {
		String s = "";
		ArrayList<String> list = new ArrayList<String>();
		if (n <= 9) {
			return String.valueOf(n);
		}
		if (n > 9) {
			String val = String.valueOf(n);
			String[] ary = val.split("");
			for (int i = 0; i < ary.length; i++) {
				list.add(ary[i]);
			}
			int index = 0;

			for (int y = 0; y < list.size(); y++) {
				try {
					if (Integer.parseInt(list.get(index)) == Integer.parseInt(list.get(index + 1))
							|| ((Integer.parseInt(list.get(index)) + Integer.parseInt(list.get(index + 1)))
									% 10 == 0)) {
						list.add(index + 1, "0");
					}
				} catch (Exception e) {
					// System.out.println(e);
				}
				index++;
			}

			for (String x : list) {
				s += x;
				;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		zeroInsertionImpl result = new zeroInsertionImpl();
		System.out.println(result.zeroInsertion(116457));
	}
}
