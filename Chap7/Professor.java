package Chap7;

public class Professor extends Person{
	private String subject;
	
	public String getsubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
			this.subject = subject;
		}
	//super.메서드   super 부모 클래스
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	} //자기께 호출 
}

