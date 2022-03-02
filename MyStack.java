package com.bridgelab.linkedlist;

public class MyStack<T> {
	private final MyLinkedList myLinkedList;

	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}
	
	public INode peek() {
		return myLinkedList.peek();
	}

	public INode pop() {
		return myLinkedList.pop();
	}
	
	public INode enqueue(Node<Integer> myenqueueNode) {
		return myLinkedList.enqueue(myenqueueNode);
	}
	
	public INode dequeue() {
		return myLinkedList.dequeue();
	}

	public void printStack() {
		myLinkedList.printMyNode();
	}
}


