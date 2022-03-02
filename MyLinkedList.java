package com.bridgelab.linkedlist;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode myNode) {
		if (this.tail == null) {
			this.tail = myNode;
		}
		if (this.head == null) {
			this.head = myNode;
		} else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public INode peek() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
			System.exit(-1);
		}else {
			INode temp=this.tail;
			if(this.head==this.tail) {
				this.tail=null;
				this.head=null;
			}
		}
		return tail;
	}

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}

	public void printMyNode() {
		System.out.println(head);
	}
}

