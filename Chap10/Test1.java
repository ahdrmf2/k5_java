package Chap10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test1 {
		public static void main(String[] args) {
		
			int min = Integer.MAX_VALUE; 	// 최대값
			int max = Integer.MIN_VALUE;	//최솟값
			int sum = 0;					//합
			int avg = 0;					//평균
	
			// 값을 담을 리스트 참조 변수 생성
			List<Integer> list = new ArrayList<>();
			
			// 리스트에 100개의 정수 랜덤으로 저장
			Random random = new Random();
			for (int i = 0; i < 100 ; i++) {
				list.add(random.nextInt(101));
			}
			
			
			// 100개의 정수값을 읽으면서 최대, 최소, 평균, 합을 구함
	
			for(int i = 0; i <list.size(); i++) {
				//max = (max < list,get(i))?list.get(i):max;
				if(max < list.get(i)) max = list.get(i); 
				if(min > list.get(i)) min = list.get(i);
				sum += list.get(i);
			}		
				avg = sum / list.size();  //평균
			// 구한 값을 출력
	
			System.out.println("합:" + sum);
			System.out.println("평균:" + avg);			 
			System.out.println("최대:" + max);
			System.out.println("최소:" + min);
			System.out.println(list);

				
			}
	
}
