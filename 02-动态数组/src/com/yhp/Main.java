package com.yhp;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> ints  = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			ints.add(i);
		}
		ints.remove(2);
		System.out.println(ints);
	}

}
