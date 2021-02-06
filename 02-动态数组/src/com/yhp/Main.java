package com.yhp;

public class Main {

	static void testArrayList() {
		ArrayList<Integer> ints  = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			ints.add(i);
		}
		ints.remove(2);
		System.out.println(ints);
	}
	
	static void testLinkedList() {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(list.size,55);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		testLinkedList();
	}

}
