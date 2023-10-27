package Chap7;

public class Employee extends Person{
	private String dept;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
			this.dept = dept;
		}
		
//super.메서드   super 부모 클래스
	@Override     //tostring + 컨트로 + 스페이스로 부모에서 오버드라이브 불러옴
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ":" + dept + "부서에서 근무중입니다.";
	} //자기께 호출 
}

