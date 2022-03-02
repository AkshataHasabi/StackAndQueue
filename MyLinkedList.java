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
	
	public INode enqueue(INode enque_node) {
		INode tempNode;
		if (this.head == null) {
			this.head = enque_node;
		}
		if (this.tail == null) {
			this.tail = enque_node;
		} else {
			tempNode = this.tail;
			tempNode.setNext(enque_node);
			this.tail = enque_node;
		}
		return null;
	}


	public void printMyNode() {
		System.out.println(head);
	}
}

