package Chap14;
interface MyInterface{
	public void print();
}	

class MyClass1 implements MyInterface{
	
	@Override
	public void print() {
		System.out.println("MyClass1의 객체");
	}
}
class MyClass2 implements MyInterface{
	@Override 
	public void print() {
		System.out.println("MyClass2의 객체");
	}
}
public class Test01 {
	//방법 4: 함수 매개변수로 익명 클래스 사용
	static void test(MyInterface mi) { //함수 매개변수의 타입이 인터페이스.
		System.out.println("함수에서 메소드 호출");
		mi.print();
	}
	static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("메소드의 리턴 값이 인터페이스 객체");
			}//인터페이스에서 mi 객체 만들고 mi리턴해준다.
		};   //mi객체를 만들고 리턴
		return mi;
	}
	static MyInterface test3() {
		return new MyInterface() {
			@Override
			public void print() {
				System.out.println("hello");
			}
		};		//객체를 가진 변수는 없지만 바로 나오는 test2,3같은 것인데 3이 좀더 편하게
	}
	public static void main(String[] args) {
		//방법1: implements 키워드로 클래스 선언
			//생성자
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		mc1.print();
		mc2.print();    
		
		//방법2: 익명클래스 사용
		MyInterface mi = new MyInterface(){
			//new MyInterface 구현한 
			// 인터페이스 구현한 클래스
			//위 명령문은 컴퓨터가 익명클래스 
			@Override  
			public void print() {
						//mi가 들어가는
				System.out.println("익명클래스 사용");
			}   
		};		//mi가 인터페이스 가리킨ㄷ
		mi.print();   //mc1 = new Myclass();
	 // 객체.메서드		//변수 =    생성자
		
		
		//방법3: 익명 클래스 선언, 익명 객체 생성, method 호출을 한번에 처리
		(new MyInterface(){
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print();	
		//.이 들어가는건 위의 mi는 new부분이 객체가 만들어지는데 이름이 없어서 익명객체임
		// 객체를 호출      
		//자바 컴파일러가 내부적으로 이름 붙여주는데 개발자눈엔 안보이니 익명으로 부름

		//방법4: 매개변수
		test(mc1);
		test(mi);
		//test함수에서 mi는 인터페이스이다.
		
		//방법5: 리턴타입
		MyInterface mi2 = test2();
		mi2.print();
		//test2결과가 객체?
	
		//일반 인터페이스 구현		//위 아래 같은
		MyInterface m = test3();
		//				함수부분
		m.print();
										
		//스태틱 마이인터페이스 test3
		//return new My인터페이스 				> ()->System.out.println("hello"); 
		// My인터페이스 m = test3();			>
		
		MyInterface m2 = ()->System.out.println("hello"); 
		//test3의 return값 부분이 sysout부분이 되서 간결하게 표기 람다식.
		m2.print();		//	함수대신 썼음 - 람다식
						// test3은 마이 인터페이스 객체로 반환한 것ㅇ
	}					//함수부분이 빠짐
}
