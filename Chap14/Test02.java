package Chap14;


interface Muleiply{
	double getValue();
}
public class Test02 {

	
	public static void main(String[] args) {
		Muleiply m;
		m = () -> 3.14*2;
		System.out.println(m.getValue());
		//인터페이스인데 익명 클래스에 익명객체로 간단한 코드다
		
		
		m = () -> 10 * 3;
		System.out.println(m.getValue());
	}
}
