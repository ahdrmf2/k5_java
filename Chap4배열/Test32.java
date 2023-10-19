package Chap4배열;

//import java.util.Scanner;

public class Test32 {
	public static void main(String[] args) {

	int[] arr = new int[5];
	arr[0] = 10; //arr의 0번지에 10 저장
	arr[1] = 20; //arr의 1번지에 20 저장
	arr[2] = 30; //arr의 2번지에 30 저장
	arr[3] = 40; //arr의 3번지에 40 저장
	arr[4] = 50; //arr의 4번지에 50 저장
	/*
	 * System.out.println(arr[0]); // arr의 0번지 값 출력 System.out.println(arr[1]); //
	 * arr의 1번지 값 출력 System.out.println(arr[2]); // arr의 2번지 값 출력
	 * System.out.println(arr[3]); // arr의 3번지 값 출력 System.out.println(arr[4]); //
	 * arr의 4번지 값 출력
	 */
	
	//int ar = 0;
	for(int ar = 0; ar < 5; ar++) {
		System.out.println(arr[ar]);
	
		System.out.println("+".repeat(20));  //string 20번 더 하라는 뜻		
	}
	
	
	
	for(int i = 0; i < 5; i++) {
	}	
		arr[0] = 10;

		Scanner sc = new Scanner(System.in); // 시스템 in 표준입력장치 out 출력장치(모니터)
		int arr[] = new int[3];

		System.out.println("국어 점수 : ");
		arr[0] = sc.nextInt();
		System.out.println("영어 점서 : ");
		arr[0] = sc.nextInt();
		System.out.println("수학 점수 : ");
		arr[0] = sc.nextInt();

					int[] a = new int[5];   초기화하고 새 배열 값을 주는 것
						a[0] = 10;
					int[] b = {10,20,30};

		for (int i = -0; i < arr.length; i++) { // length 배열의 길이라 3대신 써도 가능
			System.out.println(arr[i]);
		}
		
		int avg = (arr[0] + arr[1] + arr[2]) / 3;
		System.out.println("평균은 " + avg);
		sc.nextInt();
		
		
		System.out.println("확장된 for");  // 전부다 출력용
		for(int i : arr) {
			System.out.println(i);
		}
		
		
		int[] ar = {10, 20, 30, 40, 50};
		for (int y = 0; y < 5; y++) {
			System.out.println(ar[y]);
		}

		
	}
}
