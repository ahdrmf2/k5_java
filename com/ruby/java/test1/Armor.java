<<<<<<< HEAD
package com.ruby.java.test1;

import Chap5객체지향.*;

public class Armor { //제목
	
	private String name; // 필드 속성
	public int height;  //public 아무데서나 바꿀수 있어 정보 노출 같은
	private int speed; //
	private String color;
	private boolean isFly;
	public void test(int ... v) {
		System.out.println("test(int... v)");
				for (int x : v) { //v 배열 많이 씀
					System.out.println(" " + x);
				}
		}
		
	public void test() {
		System.out.println("test() 호출");
	}
	public void test(int a) {
		System.out.println("test(int a) 호출");
	}
	public void test(int a, int b) {
		System.out.println("test(int a) + (int b)");
	}
	public void show() {
		System.out.println(speed); //정수
		System.out.println(name); //문자열
		System.out.println(height); //정수
	}

	public void speedUp(int value) {
		System.out.println("정수 스피드 증가");
		speed += value;
	}
	public void speedUp(double value) {
		System.out.println("실수 스피드 증가");
		speed += (int)value;
	}
	public int getSpeed() {
		return speed;
	}
	//셋네임과 바꾸며 int에 하이트를 넣어 하이트를 들고오는
	public void setName(int height) { // 접근제한자 함수
		String value = "홍길동";
		name = value;
		setHeight(height);
	}
	public void setName() {
		String value = "홍길동";
		name = value;
	}
	//프라이빗은 다른 퍼블릭의 메소드를 이용해서 불러온다.
	//퍼블릭이니 setHeight이용해 허락받고 사용하는 식으로 이용가능하다
	public void setHeight(int value) {  
		if ( value > 0)
			height = value;
		else {
			System.out.println("음수 안돼");
		}
		height = value;
	}
	public int takeOff() {
		System.out.println("비행하다");
		System.out.println("아이언맨");
		return 0; 
		
		//리턴 값까지 있는거만 출력되서 맨 마지막에 있어야함
		//void 리턴값의 타입 리턴하고나서 뒤에 값이 없을때 쓰는것
		
	}
}
=======
package com.ruby.java.test1;

import Chap5객체지향.*;

public class Armor { //제목
	
	private String name; // 필드 속성
	public int height;  //public 아무데서나 바꿀수 있어 정보 노출 같은
	private int speed; //
	private String color;
	private boolean isFly;
	public void test(int ... v) {
		System.out.println("test(int... v)");
				for (int x : v) { //v 배열 많이 씀
					System.out.println(" " + x);
				}
		}
		
	public void test() {
		System.out.println("test() 호출");
	}
	public void test(int a) {
		System.out.println("test(int a) 호출");
	}
	public void test(int a, int b) {
		System.out.println("test(int a) + (int b)");
	}
	public void show() {
		System.out.println(speed); //정수
		System.out.println(name); //문자열
		System.out.println(height); //정수
	}

	public void speedUp(int value) {
		System.out.println("정수 스피드 증가");
		speed += value;
	}
	public void speedUp(double value) {
		System.out.println("실수 스피드 증가");
		speed += (int)value;
	}
	public int getSpeed() {
		return speed;
	}
	//셋네임과 바꾸며 int에 하이트를 넣어 하이트를 들고오는
	public void setName(int height) { // 접근제한자 함수
		String value = "홍길동";
		name = value;
		setHeight(height);
	}
	public void setName() {
		String value = "홍길동";
		name = value;
	}
	//프라이빗은 다른 퍼블릭의 메소드를 이용해서 불러온다.
	//퍼블릭이니 setHeight이용해 허락받고 사용하는 식으로 이용가능하다
	public void setHeight(int value) {  
		if ( value > 0)
			height = value;
		else {
			System.out.println("음수 안돼");
		}
		height = value;
	}
	public int takeOff() {
		System.out.println("비행하다");
		System.out.println("아이언맨");
		return 0; 
		
		//리턴 값까지 있는거만 출력되서 맨 마지막에 있어야함
		//void 리턴값의 타입 리턴하고나서 뒤에 값이 없을때 쓰는것
		
	}
}
>>>>>>> 88d6f3482683f653a876a4cb1ce193fc32b3fab9
