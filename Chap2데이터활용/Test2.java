package Chap2데이터활용;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				
		// double은 8byte float 4byte  

		double a = 3.14F; //더블은 플루트보다 바이트가 크기에 정보 손실이 없어서 가능 큰거에서 작은거는 해석 가능
		float f = 3.14F;  //F를 쳐서 해석 가능코드에서 실수 3.14 는 double로 해석: default로 해석
		byte num1 = 1;
		short num2 = 2;
		long num3 = 3;
		long d = 2147483648L;  //int 는 2147483647까지 가능
		int depositAmount;
		depositAmount = 50000;
		boolean isMarried = true;
		char gender = 'F';
		gender = 'M';
		String greet = "good morning"; // greet가 참조변수이다. string 는 까만 건 자바에 내장된 클래스라그럼
		
		//sysout ctrl + spacebar
		
		System.out.println(greet + "\n" + isMarried + "\\" + gender);
	}

}