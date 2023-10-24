package Chap7_test;

public class Parent {
	
	private String name;
	
	public Parent() {
		this.name  = "홍길동"; //this를 달아 명확하게 알아보기
		System.out.println("Parent()");
		}
	public Parent(String name) {
		this.name = name;
		System.out.println("Parent(String name)");
	}
	public String getName() {
		return name;
	}
}
