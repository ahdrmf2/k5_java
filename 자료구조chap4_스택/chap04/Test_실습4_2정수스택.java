package 자료구조chap4_스택.chap04;

import java.util.Random;

/*
 * 교재에 있는 소스코드
 * 입력하여 실행 실습
 * 정수형 스택 소스 코드
 */

import java.util.Scanner;

//int형 고정 길이 스택


class IntStack {
	private int[] stk; // 스택용 배열
	private int capacity; // 스택의 크기
	private int ptr; // 스택 포인터
	
	// --- 실행시 예외: 스택이 비어있음 ---//
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// --- 실행시 예외: 스택이 가득 참 ---//
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	// --- 생성자(constructor) ---//
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity]; // 스택 본체용 배열 생성 가장 먼저 푸시된 데이터 저장하는 곳 stk[0]
		} catch (OutOfMemoryError e) { // 생성할 수 없다고 알려주는 것
			capacity = 0;
		}
	}

	// --- 스택에 x를 푸시 ---//
	public int push(int x) throws OverflowIntStackException {
		if (ptr >= capacity) // 스택이 가득 참
			throw new OverflowIntStackException(); // 스택이 가득차서 푸시못하면 Over~가 나온다
		return stk[ptr++] = x;
	}

	// --- 스택에서 데이터를 팝(정상에 있는 데이터를 꺼냄) ---//
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 비어 있음
			throw new EmptyIntStackException(); // 스택이 비어 팝할수없으면 Empt~가 나온다
		return stk[--ptr];
	}

	// --- 스택에서 데이터를 피크(peek, 정상에 있는 데이터를 들여다봄) ---//
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 비어있음
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	} // if (ptr == capacity) 스택이 가득찼는지?
		// if (ptr == 0) 스택이 비어 있는지?
	// --- 스택을 비움 ---//

	public void clear() {
		ptr = 0;
	}

	// --- 스택에서 x를 찾아 인덱스(없으면 –1)를 반환 ---//
	public int indexOf(int x) { // 검색메서드indexOf0
		for (int i = ptr - 1; i >= 0; i--) // 꼭대기 쪽부터 선형 검색
			if (stk[i] == x)
				return i; // 검색 성공
		return -1; // 검색 실패
	} // 스택 본체 배열stk에 x와 같은 값의 데이터가 포함되있는지, 포함되있다면 배열 어디에 있는지 조사하는 메서드
		// 꼭대기부터 바닥으로 선형 검색. - 배열 인덱스 큰 쪽부터 작은 쪽으로 스캔.
		// 꼭대기부터 먼저 팝이 되는 데이터 찾는 ㅓㅂ.

	// --- 스택의 크기를 반환 ---//
	public int getCapacity() {
		return capacity;
	}

	// --- 스택에 쌓여있는 데이터 갯수를 반환 ---//
	public int size() {
		return ptr;
	}

	// --- 스택이 비어있는가? ---//
	public boolean isEmpty() { // isEmpty는 스택이 비어 있으면 true, 아니면 false으로 반환
		return ptr <= 0;
	}

	// --- 스택이 가득 찼는가? ---//
	public boolean isFull() { // isFull는 스택이 가득 차면 true, 아니면 false
		return ptr >= capacity;
	}

	// --- 스택 안의 모든 데이터를 바닥 → 정상 순서로 표시 ---//
	public void dump() { // 스택의 모든 데이터를 바닥부터 꼭대기순으로 출력하는 메서드 dump
		if (ptr <= 0) // <= 0부터 꼭대기
			System.out.println("스택이 비어 있습니다."); // 스택이 비어있다면 sysout출력
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}
	}
}
	public class Test_실습4_2정수스택 {

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			IntStack s = new IntStack(4); // 최대 64 개를 푸시할 수 있는 스택

			while (true) {
				System.out.println(); // 메뉴 구분을 위한 빈 행 추가
				System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
				System.out.print("(1)push　(2)pop　(3)peek　(4)dump　(0)종료: ");

				int menu = stdIn.nextInt();
				if (menu == 0)
					break;

				int x;
				switch (menu) {

				case 1: // 푸시
//					System.out.print("데이터: ");
//					x = stdIn.nextInt();
					Random rd = new Random();
					x = rd.nextInt(20);
					try {
						s.push(x);
					} catch (IntStack.OverflowIntStackException e) {
						System.out.println("스택이 가득 찼습니다.");
					}
					break;

				case 2: // 팝
					try {
						x = s.pop();
						System.out.println("팝한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;

				case 3: // 피크
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
					break;

				case 4: // 덤프
					s.dump();
					break;
				}
			}
		}
	}

