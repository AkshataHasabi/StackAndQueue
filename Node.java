package com.bridgelab.linkedlist;

public class Node<K> implements INode<K> {
	private K Key;
	private INode<K> next;

	public Node(K Key) {
		this.Key = Key;
	}

	public K getKey() {
		return Key;
	}

	public void setKey(K Key) {
		this.Key = Key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode<K> next) {
		this.next = next;
	}

	public String toString() {
		StringBuffer myString = new StringBuffer();
		myString.append("{MyNode:" + "key=").append(Key).append("}");
		if (next != null) {
			myString.append("-->").append(next);
		}
		return myString.toString();
	}
}
