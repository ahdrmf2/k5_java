package dataChap3.chap03;


//3장 - 1번 실습 과제 > 2번 실습: 스트링 객체의 정렬과 이진 탐색 > 3번 실습: 객체 정렬과 이진 탐색
//comparator 구현 실습
import java.util.Arrays;
public class Test_실습3_6_0스트링배열이진탐색 {

	public static void main(String[] args) {
		String []data = {"apple","grape","persimmon", "감", "배", "사과", "포도", "pear","blueberry", "strawberry", "melon", "oriental melon"};

		showData(data);
		sortData(data);
		showData(data);

		String key = "감";
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);

		key = "배";
		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);

	}


	
	private static void sortData(String[] data) {
		for (int i = 0; i < data.length; i++)
			for(int j = 0; j < data.length; j++) {
				if(data[i].equals(data[j])) {
					String temp;
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
	}

	private static void showData(String[] data) {
		for (String i : data) {
			System.out.println(i + " ");
		}
		
	}
	
	private static int linearSearch(String[] data, String key) {
		for(int i = 0; i < data.length; i++) {
			if (data[i].equals(key))
				return i;
		
		}
		return -1;
	}

	
	private static int binarySearch(String[] data, String key) {
		int left = 0;
		int right = data.length -1;
		
		do {
			int center = (left + right)/2;
			if (data[center] == key)
				return center;
			else if (data[center].compareTo(key) < 0)
					// a - b
					//센터보다 키 값이 크다 나타낼땐 음수가 된다.
				left = center + 1;
			else
				right = center + 1;
		} while (left <= right);
		
		return 0;
	}



}
