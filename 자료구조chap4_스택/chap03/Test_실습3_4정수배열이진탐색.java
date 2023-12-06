package 자료구조chap4_스택.chap03;

//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
import java.util.Random;

public class Test_실습3_4정수배열이진탐색 {

	public static void inputData(int[] data) {
		Random rnd = new Random();
		for (int i = 0; i < data.length; i++)
			data[i] = rnd.nextInt(50);
	}

	public static void showData(int[] data) {
		for (int d : data) {
			System.out.print(d + " ");
		}
		System.out.println();
	}

	private static void sortData(int[] data) {
		// Arrays.sort(data);

		for (int i = 0; i < data.length; i++)
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {

					int temp;
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
	}

	public static void main(String[] args) {
		int[] data = new int[10];
		inputData(data);
		showData(data);
		sortData(data);
		System.out.println();
		showData(data);
		int key = 33;
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = 39;
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}

	// 리니어는 처음 0부터 데이터 길이까지 i가 key일떄까지 쭉 검사하는것.
	static int linearSearch(int[] data, int key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == key)
				return i;
		}
		return -1;
	}

	// 이진탐색
	private static int binarySearch(int[] data, int key) {
		int left = 0; // 왼쪽
		int right = data.length - 1; // 오른쪽

		do { // while문이 참인 동안 do안의 명령문이 계속 실행된다.
			int center = (left + right) / 2; // 긴 줄에 중앙부분을 잡아야하니 le + rt더하고 /2
			if (data[center] == key) // 찾으려는 key값이 센터에 있다면
				return center; // 바로 센터값 리턴
			else if (data[center] < key) // 키 값이 센터보다 크다면 오른쪽에 값이 있기에
				left = center + 1; // 왼쪽값이 센터보다 +1 더해서 구해준다.
			else
				right = center - 1; // key값이 작다면 센터에서 오른쪽 -1
		} while (left <= right);

		return -1; // while문이 참이 아니게 되면 리턴 값 x
	}
}
