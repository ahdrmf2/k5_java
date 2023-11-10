package Chap13;

import java.util.Arrays;
import java.util.Random;

//1.정수배열 정렬  2. 객체 배열 정렬
											

public class 정수배열정렬 {

	public static void main(String[] args) {
		int [] data = new int[10];	  //10칸짜리 배열 생성
		Random rnd = new Random();		//난수생성    
		
		for (int i = 0; i < data.length; i++)
			 data[i] = rnd.nextInt(100);
				//data[i]에 rnd랜덤값 0~100까지의 수 입력
		for (int i = 0; i < data.length; i++)
			 System.out.print(data[i]+ " ");
				//위에 rnd.nextInt(100); 값을 data[i]에 저장하고 출력 
		System.out.println();
		Arrays.sort(data); //()안의 값을 정렬(기본적으론 오름차순)
		//출력 
		for (int i = 0; i < data.length; i++)
			 System.out.print(data[i]+ " ");
		
		
	}
}