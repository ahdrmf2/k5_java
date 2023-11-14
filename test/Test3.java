package test;

import java.util.Arrays;
import java.util.Random;

public class Test3 {

	public static void main(String[] args) {

		//입력된 배열 출력 & 오름차순으로 정렬한 뒤 출력
		
		//데이터 생성
		Random 	rd = new Random();
		//랜덤 정의
		int[] array = new int[24];
		//int에 24개의 배열 생성(0~23개의 배열방)
		for(int i = 0; i < array.length; i++) {
			//i가 배열의 길이까지 1씩 증가한다.
			array[i] = rd.nextInt(101);
		}	//
		System.out.println(Arrays.toString(array));
					//배열 정렬
		Arrays.sort(array);
		//배열 오름차순 정렬
		System.out.println(Arrays.toString(array));
		//배열 정령 & 출력
			
			
		//행렬 생성
		
		
		Matrix mA = new Matrix(array, 0, 3, 4); 
		mA.print();
		System.out.println("=".repeat(30));
		Matrix mB = new Matrix(array, 12, 3, 4);
		mB.print();
		
		//행렬합
		System.out.println("행렬 합을 출력합니다.");
		Matrix mC = Matrix.sum(mA,mB);
		if (mC != null) {
			System.out.println("=".repeat(30));
			mC.print(); 
		}
				
			System.out.println("=".repeat(30));
		//행렬합
		System.out.println("행렬 합을 출력합니다.");
			System.out.println("=".repeat(30));
		Matrix mD = new Matrix(array, 12, 4, 3);
		mD.print();
		
		Matrix mE = Matrix.mutiple(mA,mD);
		if (mE != null) {
			System.out.println("=".repeat(30));
			mE.print(); 
		}
	}
	
}	


