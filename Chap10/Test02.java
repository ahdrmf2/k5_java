package Chap10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		
			//인덱스처럼 get i를 가져와서 0부터 시작
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===================");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
