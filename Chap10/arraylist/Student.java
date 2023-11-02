package Chap10.arraylist;

public class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// super.메서드 super 부모 클래스
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ":" + major;
		// 자기께 호출
	}
}
