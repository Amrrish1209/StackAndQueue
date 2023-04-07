package com.bridgelabz.stackandqueue;

import java.util.LinkedList;

public class Queue<T> {
	private LinkedList<T> list;

	public Queue() {
		list = new LinkedList<>();
	}

	public void enqueue(T data) {
		list.addLast(data);
	}

	public void display() {
		for (T data : list) {
			System.out.print(data + " -> ");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.display();

	}
}
