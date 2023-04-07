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

	public T pop() {
		if (list.isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		T poppedElement = list.removeFirst();
		System.out.println("Popping: " + poppedElement);
		if (list.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.print("->");
		}
		while (!list.isEmpty()) {
			System.out.print(list.removeFirst() + " -> ");
		}
		System.out.println("null");
		return poppedElement;
	}

	public T peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		return list.getFirst();
	}

	public boolean isEmpty() {
		return list.isEmpty();
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
		System.out.println("Peeking: " + stack.peek());
		stack.display();
		stack.pop();
		stack.display();
	}
}
