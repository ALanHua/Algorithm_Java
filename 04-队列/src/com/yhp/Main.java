package com.yhp;

public class Main {

	static void test1() {
		Deque<Integer> queue = new Deque<>();
		
		queue.enQueueFront(11);
		queue.enQueueFront(22);
		queue.enQueueRear(33);
		queue.enQueueRear(44);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.deQueueRear());
		}
	}
	
	public static void main(String[] args) {
		test1();
	}

}
