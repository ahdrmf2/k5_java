package Chap4;

public class Test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						//j
		int[][] arr =  {{1,  2,  3,  4,  5},
						{6,  7,  8,  9,  10},
						{11, 12, 13, 14, 15},		
						{16, 17, 18, 19, 20},
						{21, 22, 23, 24, 25}};
		 			//i 
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {      // i
 			for(int j = 0; j <= i; j++) {
				sum = sum + arr[i][j];
//				i는 0부터 쭉 늘어남       
//				j는 0부터 i까지만 늘어남 
//				(j= 0,1,2..i)		
			}
		}
		System.out.println("합계 : " + sum);
		
		int[][] arrA = {{1,2,3},{4,5,6}};
		int[][] arrB = {{1, 2}, {3,4}, {5,6}};
		
		for (int i = 0; i < arrA.length ; i++) {
			for (int j = 0; j < arrB[0].length ; j++) {
				int sum = 0;
				for (int k = 0 ; k < arrB.length ;k++) {
					sum += (arrA[i][k]) * arrB[k][j];
				}
				System.out.println(sum + "\t");
			}
			System.out.println("\n");
		}

	}

}
