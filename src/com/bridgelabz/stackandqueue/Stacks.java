package com.bridgelabz.stackandqueue;

import java.util.LinkedList;

public class Stacks<T> {
	private LinkedList<T> list;

	public Stacks() {
		list = new LinkedList<>();
	}

	public void push(T data) {
		list.addFirst(data);
	}

	public void display() {
		for (T data : list) {
			System.out.print(data + " -> ");
		}
		System.out.println("null");
	}

	public static void main(String[] args) {

		Stacks<Integer> stack = new Stacks<>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.display();
	}
}
