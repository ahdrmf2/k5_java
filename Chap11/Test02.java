package Chap11;

public class Test02 {
	public static void main(String[] args) {
		try {
			System.out.println("1");
			String s = null;   //예외발생해서 바로 캐리초 점프
			s.length();				
			System.out.println("2");
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류 발생");
		} finally {
			System.out.println("OK");
		}
		System.out.println("4");
	}		// 정상 수행 된것
}
