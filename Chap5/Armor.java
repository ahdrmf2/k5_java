<<<<<<< HEAD
package Chap5객체지향;
//클래스를 기술한 것
public class Armor {  //
	//필드   속성, 상태
	// 접근 제한자 public, private 외부에서 사용하는 것을 제한
	private String name;
	public int height;
	public int speed;  //default => 접근제한자를 기술하지 않음
	private String color;
	private boolean isFly;
	public void show() {
		System.out.println(speed); //정수
		System.out.println(name); //문자열
		System.out.println(height); //정수
	}
	
	//메서드 동작, 행동
	//void 데이터 타입 없는 키워드 ()치면 함수이다. {} 본체, 블럭이라함
	void takeOff() {}   //암것도 안적어서 미완성인것
	private void landing (String name) { //접근하는곳
			//private에 선언한 name은 다른 파일에서는 사용 못하게 된다.
		}
	void land() {}
	void shootLaser() {}
	void launchMissile() {}
	
	
		
	
	
	
	//메인에서 위의 f 함수 호출
	
	

//	int f(int x) {
//		int value;
//		value= = 2*x*x+4*x+5;
//		return value;
}
=======
package Chap5;
//클래스를 기술한 것
public class Armor {  //
	//필드   속성, 상태
	// 접근 제한자 public, private 외부에서 사용하는 것을 제한
	private String name;
	public int height;
	public int speed;  //default => 접근제한자를 기술하지 않음
	private String color;
	private boolean isFly;
	public void show() {
		System.out.println(speed); //정수
		System.out.println(name); //문자열
		System.out.println(height); //정수
	}
	
	//메서드 동작, 행동
	//void 데이터 타입 없는 키워드 ()치면 함수이다. {} 본체, 블럭이라함
	void takeOff() {}   //암것도 안적어서 미완성인것
	private void landing (String name) { //접근하는곳
			//private에 선언한 name은 다른 파일에서는 사용 못하게 된다.
		}
	void land() {}
	void shootLaser() {}
	void launchMissile() {}
	
	
		
	
	
	
	//메인에서 위의 f 함수 호출
	
	

//	int f(int x) {
//		int value;
//		value= = 2*x*x+4*x+5;
//		return value;
}
>>>>>>> 88d6f3482683f653a876a4cb1ce193fc32b3fab9
