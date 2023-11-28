package dataChap3.chap02;

//교재 60 - 실습 2-6
//2번 실습
import java.util.Random;

public class Test_실습2_6정수배열정렬 {
	public static void main(String[] args) {
		int[] data = new int[10];
		inputData(data);
		for (int num : data) {
			System.out.print(num + " ");
		}
		/*
		 * sortData(data); System.out.println(); for (int num: data) {
		 * System.out.print(num+" "); }
		 */
		reverse(data);// 역순으로 재배치 - 정렬 아님
		System.out.println();
		for (int num : data) {
			System.out.print(num + " ");
		}
		reverseSort(data);// 역순으로 재배치 - 정렬 아님
		System.out.println();
		for (int num : data) {
			System.out.print(num + " ");
		}
	}

	static void inputData(int[] data) {
		// 난수
		Random rd = new Random();
		for (int i = 0; i < data.length; i++)
			data[i] = rd.nextInt(20);
	}

	static void sortData(int[] arr) {
		// 정렬
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}

	static void reverse(int[] a) {
		// 배열역순
		int n = a.length;
		for (int i = 0; i < n / 2; i++) {
			swap(a, i, n - (i + 1));
			//(n -1) -i - (n-1) 실질적인 배열 끝자리. -i 부분이 앞의 i가 진행되는 만큼 뒤에서도 같이 진행되는
			//n -(i+1)
			
					//swap(a,x,y)  
						//a=스왑을 수행할 배열 이름 
						// x는 스왑을 수행할 배열의 시작 자리
						// y는 스왑을 수행할 배열의 끝 자리
	
		}
	}
	static void swap(int[] a, int i, int j) {
		int temp;
		temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

	static void reverseSort(int[] arr) {
		// 내림차순
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
	}
}
