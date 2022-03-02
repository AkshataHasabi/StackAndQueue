package com.bridgelab.linkedlist;

public class Main {
	public static void main(String[] args) {
		System.out.println("welcome to stack and queue programms");
		 Main  main=new  Main();
		 main.given3NumberWhenAddedToStackShouldHaveLastAddedNode();
		 main.given3NumberInStackWhenPopedShouldMatchWithLastAddedNode();
		 main.enQueueElement();
		 main.deQueueElement();
	}
	
	public void given3NumberWhenAddedToStackShouldHaveLastAddedNode() {
		MyStack myStack = new MyStack();
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		MyLinkedList myLinkedList = new MyLinkedList();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		
		INode pop = myStack.pop();
		myStack.printStack();
	}	
	
	public void given3NumberInStackWhenPopedShouldMatchWithLastAddedNode() {
		MyStack myStack = new MyStack();
		Node<Integer> myFirstNode = new Node<>(70);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(56);
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		INode peak = myStack.peek();
		myStack.printStack();
	}
	
	public void deQueueElement() {
		MyStack myStack = new MyStack();
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);

		myStack.enqueue(myFirstNode);
		myStack.enqueue(mySecondNode);
		myStack.enqueue(myThirdNode);
		myStack.printStack();

		myStack.dequeue();
		myStack.printStack();
		myStack.dequeue();
		myStack.printStack();
	}
	
	public void enQueueElement() {
		MyStack myStack = new MyStack();
		Node<Integer> myFirstNode = new Node<>(56);
		Node<Integer> mySecondNode = new Node<>(30);
		Node<Integer> myThirdNode = new Node<>(70);

		myStack.enqueue(myFirstNode);
		myStack.enqueue(mySecondNode);
		myStack.enqueue(myThirdNode);
		myStack.printStack();
	}
}
