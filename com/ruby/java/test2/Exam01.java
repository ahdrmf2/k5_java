package com.ruby.java.test2;
import com.ruby.java.test1.Armor;
//import 다른 패키지에 있는거 가져오고 *을 적으면 모든 파일 들고오는것
public class Exam01 {
public static void main(String[] args) {
	
	//Armor arm = new Armor(); 객체를 만드는것
	Armor arm = new Armor();  
	arm.setHeight(100);
	arm.height = 99;
	arm.setHeight(55);
	int result = arm.takeOff();
	System.out.println("result = " + result);
	arm.speedUp(100);
	int speed = arm.getSpeed();
	//System.out.println(height);
	System.out.println(arm.height);
	arm.show();
	arm.speedUp(99.9999);
	arm.test();
	arm.test(1,2,3);
}
}
