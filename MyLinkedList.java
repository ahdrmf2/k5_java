package edu.ch08.innerClass;

public class MyLinkedList {
	// 링크드리스트의 시작 노드 참조값
	private Node head = null;
	//내부 클래스
	private class Node {
		private String data; 
		//데이터를 저장하는 필드변수 (저장 제이터가 String Type)
		private Node link; 
		//현재 노드 다음에 연결된 노드 참조값을 저장하는 참조변수

		//노드 생성자(파라미터로 데이터(String)입력해야 함.)
		public Node(String data) {
			this.data = data;
		}
	}		//참조형 데이터는 무조건 힙영역
	// 노드를 추가하는 메서드(Method)
	public void add(String data) {
		//새로운 노드를 생성한다. 왼쪽은 임시 메모리 오른쪽이 직접 만들어지는것
		Node newNode = new Node(data);
		if (head == null) { 
			//리스트의 시작점인 head가 아무것도 없으면 = null이면
			head = newNode; 
			// 새로 만든 노드를 시작점으로 설정한다.
		} else {
			//여기에 들어온다는 의미는 head에 이미 노드가 설정되어 있다는 의미
			//최소 1개 이상의 노드가 리스트에 존재한다는 의미다 헤드는 맨앞에 하나만 보여서뒤에 몇개인지 모름
			
			//시작 노드값을 임시 변수 next에 설정 헤드는 사라지지 않아서 뒤에 있는 헤드만 이용
			Node next = head;

			while (next.link != null) { 
				// 만약 현재 노드인 next에 연결된 노드가 있는 동안 루프
				next = next.link; 		
				// 다음 노드를 현재 노드로 설정
			}
			//여기까지 오면 리스트의 끝 노드에 도착했다는 의미
			// 그래서 마지막 노드인 next의 다음 연결 노드로 newNode를 설정
			next.link = newNode;
		}
	}
	//현재까지 입력된 리스트를 콘솔 화면에 출력한다.
	public void print() {
		// head가 null이라는 의미는 데이터가 add된 적이없다는 뜻이다.
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
			// 출력할 데이터가 없으므로 그냥 리턴
			return;
		} 

			//여기까지 오면 출력할 데이터가 있다는 뜻이된다.
			System.out.println("등록된 데이터는 다음과 같습니다.");
			
			//시작 노드 값을 임시 변수 next에 설정
			Node next = head;
			
			// 현재 노드인 next가 null이 아닌 동안 루프
			while (next != null) {

				//현재 노드를 콘솔 화면에 출력한다.
				
				System.out.println(next.data);
				// 현재 노드를 연결된 다음 노드로 설정한다.
				next = next.link;
			}
		}
	}
}