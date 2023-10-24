package Chap5객체지향;

public class Test1_1 {
	public static int f(int x) {
	int value;
	value = 2 * x * x + 4 * x + 5;
	return value;
}	
	public static void main(String[] args) {
		int y;
		y = f(2);
		
		//같은 패키지내에 default이면 사용가능
		
		
		//protected 중요하다 하위 클래스 사용 가능
		
	}
}
