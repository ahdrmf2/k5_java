package Chap13;

import java.util.Arrays;

public class GenMethodTest {
	static <T extends Number, V extends T> boolean isInclude(T num, V[]array) {
			for(int i = 0; i < array.length; i++) {
				System.out.println("num =" + num + "array[i] =");
				if(array[i] == num)
					return true;
			}			// T,V는 개발자가 지정한거다.
			return false;
	}
	static void sort() {
	//스태틱이 있으면.	밑 부분 sort이 바로 가능
	}
public static void main(String[] args) {
	GenMethodTest g = new GenMethodTest();
	GenMethodTest.sort();
	Arrays.sort(null);
	// sort는 스태틱 메서드가 되어 있어서 바로 호출 가능
	Integer[] inum = {1, 2, 3, 4, 5};
	//inum.equals(inum);
	//inum이 .점을 찍어 메서드가 되었따
	Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
	String[] snum = {"one", "two", "three", " four", "five"};
	
	
	isInclude(3,inum)
	
	boolean b1 = isInclude(3, inum);
			//메서드 함수, 함수 호출해주는 isInclude  
			
	System.out.println("결과 : " + b1);
	
	boolean b2 = isInclude(5.0, dnum);
	// 더블로 바뀐 코드 코드 생성 후 호출.
	//제너릭이란 컴파이러는 코드를 자동 생성해줌.
	System.out.println("결과 : " + b2);
	isInclude("one", snum);
		//isInclude에서 넘버가 아닌걸로 제한해서 오류가 뜬다.
	GenMethodTest.<Integer, Integer>isInclude(3, inum);
	GenMethodTest.<Double, Double>isInclude(5.0, dnum);
 	//GenMethodTest.<String, String>isInclude("one", inum);
	
	}
}	

