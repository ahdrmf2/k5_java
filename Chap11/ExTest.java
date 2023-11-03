package Chap11;

public class ExTest {

	public void c() throws Exception {

//	public void d() {
//		throw new IndexOutOfBoundsException("에러가 발생했습니다.");
//		
//		
//	}		//예외를 의도적으로 만드는것

		try {
			System.out.println("C1");
			// int v = 10 / 0;
		} catch (Exception e) {

		} finally {
			System.out.println("C-fnally");
			System.out.println("C2");
		}
	}

	public void b() throws Exception {
		System.out.println("B1");
		c();
		System.out.println("B2");
	}

	public void a() {
		System.out.println("A1");
		try {
			b();
		} catch (Exception e) {
			// System.out.println("오류발생 : " + e.getMessage());
			System.out.println("A2");
		}
	} // static 없으면 위는 호출 못함

	public static void main(String[] args) {

		ExTest at = new ExTest();
		at.a();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 3초간 딜레이
		// 트라이캐치는 직접 예외를 잡아서 처리. 쓰로우는 예외를 나를 부른 호출자에 줘서 예외처리해달라고 보내는 것
		System.out.println("Fine!");
	}
}
