package Chap8;

public class MyLinkedList {

	private Node head = null;

	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	public void add(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			next.link = newNode;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
		public static void main(String[] args) {
			MyLinkedList myList = new MyLinkedList();
			myList.print();

			myList.add("JAVA");
			myList.add("JSP");
			myList.add("Servlet");
			myList.print();

		}
	}


