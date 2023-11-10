package Chap9;

import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {
	
		String msg = "Although the world is full of sufferong, it is full also of the overcoming of it.";
		
		//문장에서 단어의 집합을 만들고 단어의 객체를 메서드로서의 토큰 갯수 샘
		StringTokenizer st1 = new StringTokenizer(msg);
		System.out.println(st1.countTokens());         //갯수 출력
		while (st1.hasMoreTokens()) {
			System.out.println("단어수 = " + st1.countTokens());
			System.out.println(st1.nextToken());		//다음 토큰? 토큰 하나를 주고 토큰 하나를 빼는? 커서가 있다.
			// 넥스트토큰을 부르면 커서가 계속 내려가며 갯수가 점점 빠진다.  
		}
		String s = "id=guest&name=Amy&pwd=1234";
		StringTokenizer st2 = new StringTokenizer(s,"=&");
		
		
		
//		System.out.println("단어 수 : " + st1.countTokens() );
//
//		
//		System.out.println("==================");
//		String s = "id = guest&name=Amy&pwd = 1-84";
}
}
