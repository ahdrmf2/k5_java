package 자료구조chap_6;

import java.util.Scanner;

public class InsertionSort {
	
	//단순 삽입 정렬
	static void insertionSort(int[] a, int n) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			int j;								//아직 정렬되지 않은 부분에서 가장 작은 요소
			int tmp = a[i];						//카드를 꺼내서
			for(j = i; j > 0 && a[j - 1] > tmp; j--)	{//좌측 카드가 꺼낸 카드
				count++;
				a[j] = a[j - 1];				//좌측 카드 우측으로 이동
			}
			a[j] = tmp;	//꺼낸 카드를 넣는다 : 이것이 insertion
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("단순 삽입 정렬");
		System.out.println("요솟수:");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i  = 0; i < nx; i++) {
			System.out.println("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		insertionSort(x,nx);						//배열 x를 단순 삽입 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]=" + x[i]);
	}
}
