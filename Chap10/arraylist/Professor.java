package Chap10.arraylist;

public class Professor extends Person {
	private String subject;

	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getsubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	// super.메서드 super = 부모 클래스
	@Override
	public String toString() {
		return super.toString() + " :" + subject;

		
	
		
	} // 자기께 호출
}
