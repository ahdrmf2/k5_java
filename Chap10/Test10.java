package Chap10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10 {

	public static void main(String[] args) {
		
		lotto_generator(5);
		//
	}
	public static void lotto_generator(int n) {
		Random num = new Random();    //랜덤 번호를 인스턴스로 정의한다.
		
		HashSet<Integer> lotto = null; 
		for(int i = 1; i < n; i++) {
			
			lotto = new HashSet<Integer>();  
			//해쉬셋을 이용해 인티저에 키값을 저장한다.
			//반복문안에 HashSet 객체 생성
			//for(int j = 0; lotto.size() <= 6; j++) { 
			
			while(lotto.size() <= 6) {         //위 for에 j가 필요 없어서 wjile로도 가능
				//위 반복문은 각 HashSet에 저장되는 숫자 개수만큼 반복
				//size가 6가 될 떄까지 반복하고 중복XXX
				lotto.add(num.nextInt(45)+1);  // 새로운 데이터를 또 추가하고 HashSet에 저장된 값이 있다면 저장x 중복 안됨
				lotto.add(num.nextInt(1, 46)); //같은 코드
			}
			List<Integer>L = new ArrayList<Integer>(lotto);
			Collections.sort(L);
			System.out.println(L);
			
		}
	}	
}
