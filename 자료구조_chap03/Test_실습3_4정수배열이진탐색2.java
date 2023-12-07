package 자료구조_chap03;

//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
import java.util.Random;

public class Test_실습3_4정수배열이진탐색2 {

	public static void inputData(int[] data) { // 랜덤 번호를 받아봐야한다.
		Random rd = new Random(); // 랜덤 rd(변수) = new 랜덤(); -랜덤 숫자가 rd라는 변수에 값이 들어오고
		for (int i = 0; i < data.length; i++) { // for i가 내가 설정한 data.length(데이터길이)까지 반복문을 돈다.
			data[i] = rd.nextInt(50); // data[i]에 데이터에 배열을 만들고 그 변수 이름은 i이고
										// rd.nextInt(50)- 50번까지의 랜덤 숫자를 저장한다.
		}

	}

	public static void showData(int[] data) { // 데이터를 보여주기 위해 적어주는
		for (int d : data) { // int d 에 data 값을 넣어주고
			System.out.print(d + " "); // 값을 출력해 본다.
		}
		System.out.println();

	}

	private static void sortData(int[] data) { // 데이터를 비교하고 정렬하는 것.
		for (int i = 0; i < data.length; i++) { // for문 두개를 이용해 양옆의 값을 비교하고 작은거 앞으로 보내며 정렬
			for (int j = 0; j < i; j++) { // for int i 와 j를 만들어
				if (data[i] < data[j]) { // if를 이용해 data[i] i배열에 들어있는 데이터와, data[j]배열에 들어있는 데이터를 비교를 원한다고 if를 이용
					int temp = 0; // 데이터 비교하며 값을 옮겨주기 위해 temp라는 더미 데이터를 만들고
					temp = data[i]; // temp와 data[i] 비교하며 if의 <(부등호)에 맞게
					data[i] = data[j]; // 왼쪽이 크면 오른쪽과 바꾸고 왼쪽이 작으면 나두는 식으로 배열을 정렬해주는 것.
					data[j] = temp;
				}
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
		for (int i = 0; i < data.length; i++) { // for문으로 i의 데이터 끝까지 설정해서 반복되게 만들고
			if (data[i] == key) // if의 data[i](i배열의 데이터에서) == key 키 값이 같을떄가지 설정한다.
				return 1;
		}
		return -1;
	}

	// 이진탐색
	private static int binarySearch(int[] data, int key) {
		int left = 0; // 왼쪽 0부터 시작
		int right = data.length - 1; // 오른쪽 배열은 0부터 시작이니 -1

		do {
			int center = (left + right) / 2; // 센터라는 변수에 왼쪽, 오른쪽 배열의 평균값을 구해서 값을 저장하고
			if (data[center] == key) // if문으로 센터의 데이터에 키 값이 들어있다면
				return center; // 센터값을 리턴한다.
			else if (data[center] < key)
				left = center + 1;
			else
				right = center - 1;
		} while (left <= right);

		// while문이 참인 동안 do안의 명령문이 계속 실행된다.

		// 긴 줄에 중앙부분을 잡아야하니 le + rt더하고 /2
		// 찾으려는 key값이 센터에 있다면
		// 바로 센터값 리턴
		// 키 값이 센터보다 크다면 오른쪽에 값이 있기에
		// 왼쪽값이 센터보다 +1 더해서 구해준다.

		// key값이 작다면 센터에서 오른쪽 -1
		return -1; // while문이 참이 아니게 되면 리턴 값 x
	}
}
