package Chap7상속과인터페이스;

public class Student extends Person{
	private String major;
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
		//super.메서드   super 부모 클래스
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		//자기께 호출 
	}
}
