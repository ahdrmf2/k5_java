package com.ruby.java.ch09;

public class Test01 {

	public static void main(String[] args) {
		String s = new String("Kim");
		String s1 = new String("Hong");
		Object obj1 = new Object();
		System.out.println(obj1.hashCode());   		//스트링 클래스에 정의 되지 않은 것, 정수,실수는 정의되어 있음
		System.out.println(Integer.toHexString(obj1.hashCode()));
		Object obj2 = new Object();  				   //해쉬코드는 객체마다 코드.
		if(obj1.equals(obj2)) 		//equals은 true, fales
			System.out.println("같다");
		else
			System.out.println("다르다");
		if (obj1 == obj2)
			System.out.println("같다");
		System.out.println(obj2.hashCode()); 
		Object obj3 = new Object();
		System.out.println(obj3.hashCode()); 
		System.out.println(obj1.getClass());
		System.out.println(obj2.getClass());
		System.out.println(obj1.toString());		
		System.out.println(obj1);   // printil함수는 파라미터로 스트링이 와야하는데 객체로 obj1가 있어서 to String를 자동 호출해서 실행된다.
		MyObject obj4 = new MyObject();
		System.out.println(obj4.toString());
		//if (s.compareTo(s1)<0); //compareTo 스트링과 스트링 비교
			//System.out.println();
	}

}
