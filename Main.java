package com.bridgelab.linkedlist;

public class Main {
	public static void main(String[] args) {
		System.out.println("welcome to stack and queue programms");
		 Main  main=new  Main();
		 main.given3NumberWhenAddedToStackShouldHaveLastAddedNode();
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
	}	
}
