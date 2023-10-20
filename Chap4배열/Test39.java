package Chap4배열;

public class Test39 {
public static void main(String[] args) {
	
	
	int[][] arr = new int[5][10];
	int num =1;
	// 배열에 값 설정
	for(int i = 0; i < arr.length; i++) {
		for(int j = 0; j < arr[i].length; j++) {
			arr[i][j] = num++;
		}
	}
	
	// 배열에설정 된 값을 화면에 출력
	for(int i = 0; i < arr.length;i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]);
			System.out.print("\t");
		}
		System.out.println("\n");}
	
	for(int i = 0; i < arr.length;i++) {
		for(int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]);
			System.out.print("\t");
		}
		System.out.println("\n");}
	
//		  j
//		1  2  3  4  5
//		6  7  8  9  10
//		11 12 13 14 15
//		16 17 18 19 20
//		21 22 23 24 25
//		대각선 1, 7, 13, 19, 25 의 합		
//    i
	
//	1 = (0.0) 7 = (1,1) 13 = (2,2) 19 = (3,3), 25 = (4,4)
	
		
// 배열의 대각 합을 구해서 설정
	int sum = 0;
//	for(int i = 0; i < arr.length;i++) {
//		for(int j = 0; j < arr[i].length; j++) {
//			if (i == j) sum + arr[i][j];
//		}
//			System.out.print(arr[i][j]);

for(int i = 0; i < arr.length && i < arr[0].length; i++)  //for문은 항상 참 거짓 arr랭스보다 잒은 0으로 돌림.
	sum += arr[i][i];
	
	//배열의 대각 합을 출력
	System.out.println("합 :" + sum);
	
	
	
	
	
	
	
	
	}
}
