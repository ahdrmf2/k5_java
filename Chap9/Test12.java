package Chap9;

public class Test12 {

	public static void main(String[] args) {
		int n1 = 10;
		Integer obj1 = n1; //Interger.valueOf(n1)
		Integer obj2 = Integer.valueOf("20");
						//valueOf는 정수를 객체로 박싱하는 것 안적어도 가능함

		int n2 = obj2; // 언박싱하는것
		int i3 = Integer.parseInt("123");
					//입력된 스트링(문자열)을 정수로 바꾼 래퍼클래스?
					//스트링은 첫번쨰 문자 그대로 처리?    9 < 2 / "9" > "21"
		String s1 = "9";
		int ns1 = Integer.parseInt(s1);
		int ns2 = Integer.parseInt(s2);
		String s2 = "21";
		if (s1.compareTo(s2)< 0)
			System.out.println("9 < 21");
		else
			System.out.println("9 > 21");
		Integer obj3 = 30;
		
		int n3 = obj3 + 40;
		
		System.out.println(n1 + " : "+ obj1);
		System.out.println(obj2 + " : " + n2);
		System.out.println(n3);
		
	}
}
