package Chap10;

import java.util.ArrayList;
import java.util.List;

public class StarArrayList {
	public static void main(String[] args) {

		// Scanner 객체를 생성해서 반복값 입력
		// 테스트로 5로 일단 설정해서 작업
		//int repeat = 5; // 인트값

		// ArrayList 객체 생성
//		List<String> list = new ArrayList<>();
//		list.add("*");

		// 저장할 문자열을 생성해서 ArrayList에 저장
		// repeat 횟수만큼 반복(for loop)
		// for (int add = 1; add < list.size(); add++) {
//		for (int i = 1; i <= repeat; i++)
//		{
//			list.add("*".repeat(i));
//			// int 5

//			System.out.println(list);
//		}
		// ArrayList에 저장된 문자열을 출력
		
		// Scanner 객체를 생성해서 반복값 입력
		// 테스트로 5로 일단 설정해서 작업

		int repeat = 5;
		
		// ArrayList 객체 생성
		List<String> list = new ArrayList<>();
		
		
		// 저장할 문자열을 생성해서 ArrayList에 저장
		// repeat 횟수만큼 반복(for loop)
//		for ( int i = 1; i <= repeat ; i ++) {
//			list.add("*".repeat(i));
//		
//		}
//		
//		for (int i = 1; i <= repeat ; i++) {
//			String s = "";
//			for(int j = 0; j < i ; j++) {
//				s += "*";
//			}
//			list.add(s);
//		}
		for (int i = 1; i <= repeat ; i++) {
			StringBuffer s = new StringBuffer();
			for(int j = 0; j < i ; j++) {
				s.append("*");
		}
			list.add(s.toString());
		}
		
		
		// ArrayList에 저장된 문자열을 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-".repeat(30));
		list.forEach(s->System.out.println(s));
		
		
		
		
		
		
		
	}
}
//*
//**
//***
//****
//*****
