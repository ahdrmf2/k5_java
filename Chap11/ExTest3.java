package Chap11;

public class ExTest3 {
//	public void d() {
//		throw new IndexOutOfBoundsException("에러가 발생했습니다.");	
//	}		//예외를 의도적으로 만드는것

	public void c()  {
		System.out.println("C1");
		int v = 10 / 0; // 오류 발생해서 밑에껀 진행 안됨
		System.out.println("C-fnally");
		System.out.println("C2");
	}

	public void b()  {
		System.out.println("B1");
		c();
		System.out.println("B2");
	}

	public void a() {
		System.out.println("A1");
			b();
		System.out.println("오류발생 : " + e.getMessage());
		} 
//
		System.out.println("A2");
	} // try는 안의 내용 실행해주고 catch(Exception e)가 오류를 표시를 해준다.

	public static void main(String[] args) {
		ExTest3 at = new ExTest3();
		at.a();

		// ExTest2 클래스에 at라는 새객체를 생성한것.(인스턴스 클래스)
		// at.a();를 찾는것

//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// 3초간 딜레이
		// 트라이캐치는 직접 예외를 잡아서 처리. 쓰로우는 예외를 나를 부른 호출자에 줘서 예외처리해달라고 보내는 것
		System.out.println("Fine!");
	}
}
