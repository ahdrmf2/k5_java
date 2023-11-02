package com.ruby.java.ch09;

public class Test02 {
	
	public static void main(String[] args) {
		
		String s1 = new String("java");  //new로 각각의 새로운 객체가 생성된것
		String s3 = new String("java");
		String s2 = "java"; //데이터 pool에 같이 저장되어 있는
		String s4 = "java";  //
		System.out.println(s1 + " :: " + s3);
		//s1 == s2?
		//s3 == s4?
		//s1 == s3?
		String s5 = "JAVA";
		if(s1.equals(s5)) 
			System.out.println("same");
		else
			System.out.println("different");
		
		
		
		if(s1 == s3)			
			System.out.println("same");
		else
			System.out.println("different");
		if(s2 == s4)			
			System.out.println("same");
		else
			System.out.println("different");	
	}
}
