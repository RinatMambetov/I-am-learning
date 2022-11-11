package myLL;

import java.util.Arrays;

public class MyLL {

	private Node head;
	private int size;

	public class Node {

		private int value;
		private Node next;

		public Node(int value) {
			setValue(value);
		}

		public int getValue() {
			return value;
		}

		public Node getNext() {
			return next;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	public void add(int value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(new Node(value));
		}
		size++;
	}

	public int getSize() {
		return size;
	}

	public String toString() {
		int[] arr = new int[size];
		Node temp = head;
		int i = 0;

		while (i < size) {
			arr[i] = temp.getValue();
			temp = temp.getNext();
			i++;
		}
		return Arrays.toString(arr);
	}

	public int get(int idx) {
		Node temp = head;
		int i = 0;

		while (i < idx) {
			temp = temp.getNext();
			i++;
		}
		return temp.getValue();
	}

	public void remove(int idx) {
		Node temp = head;
		int i = 0;

		while (i < idx - 1) {
			temp = temp.getNext();
			i++;
		}
		temp.setNext(temp.getNext().getNext());
		size--;
	}
}
