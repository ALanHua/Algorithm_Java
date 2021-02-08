package com.yhp;

import com.yhp.circle.CircleLinkedList;
import com.yhp.circle.SingleCircleLinkedList;
import com.yhp.single.SingleExLinkedList;
import com.yhp.single.SingleLinkedList;

public class Main {

	static void testArrayList() {
		ArrayList<Integer> ints  = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			ints.add(i);
		}
		ints.remove(2);
		System.out.println(ints);
	}
	
	static void testLinkedList(List<Integer> list) {
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(list.size(),55);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
	}
	
	static void josephus() {
		CircleLinkedList<Integer> list = new CircleLinkedList<>();
		
		for (int i = 1; i <= 8; i++) {
			list.add(i);
		}
		// 指向头结点
		list.reset();
		while(!list.isEmpty()) {
			list.next();
			list.next();
			System.out.println(list.remove());
		}
		
	}
	
	public static void main(String[] args) {
//		testLinkedList(new LinkedList<>());
//		testLinkedList(new SingleExLinkedList());
//		testLinkedList(new SingleCircleLinkedList());
//		testLinkedList(new CircleLinkedList());
		josephus();
	}

}
