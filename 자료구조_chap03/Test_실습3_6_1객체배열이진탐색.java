package 자료구조_chap03;

import java.util.Arrays;

//5번 실습 - 2장 실습 2-14를 수정하여 객체 배열의 정렬 구현
class PhyscData implements Comparable<PhyscData> {
	String name;
	int height;
	double vision;

	
	PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	
	@Override
	public int compareTo(PhyscData o) {
		
		return (this.name.compareTo(o.name));// 이름으로 비교
		
	}

}

public class Test_실습3_6_1객체배열이진탐색 {

	public static void main(String[] args) {
		PhyscData[] data = { new PhyscData("홍길동", 162, 0.3), new PhyscData("홍동", 164, 1.3),
				new PhyscData("홍길", 152, 0.7), new PhyscData("김홍길동", 172, 0.3), new PhyscData("길동", 182, 0.6),
				new PhyscData("길동", 167, 0.2), new PhyscData("길동", 167, 0.5), };
		showData(data);
		sortData(data);
		showData(data);

		PhyscData key = new PhyscData("길동", 167, 0.2);
		int result = linearSearch(data, key);
		System.out.println("\nlinearSearch(): result = " + result);
		key = new PhyscData("길동", 167, 0.5);

		result = binarySearch(data, key);
		System.out.println("\nbinarySearch(): result = " + result);
		int idx = Arrays.binarySearch(data, key);
		System.out.println("\nArrays.binarySearch(): result = " + result);
	}

	private static int linearSearch(PhyscData[] data, PhyscData key) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].compareTo(key) == 0)
				return i;
		}
		return 0;
	}

	private static int binarySearch(PhyscData[] data, PhyscData key) {
		int left = 0;
		int right = data.length - 1;

		do {
			int center = (left + right) / 2;
			if (data[center].compareTo(key) == 0)
				return center;
			else if (data[center].compareTo(key) < 0)
				left = center + 1;
			else
				right = center - 1;
		} while (left <= right);

		return -1;
	}

	private static void sortData(PhyscData[] data) {
		for (int i = 0; i < data.length; i++)
			for (int j = 0; j < data.length; j++) {
				if (data[i].compareTo(data[j]) > 0) {
					//
					// '사실상' data[i] - data[j]
					PhyscData temp;
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}

	}

	static void showData(PhyscData[] arr) {
		System.out.println();
		for (PhyscData fruit : arr) {
			System.out.print(fruit + " ");
		}
		System.out.println();
	}

}
