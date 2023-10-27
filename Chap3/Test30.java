package Chap3;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ix  = 6;
		if(1x%2 == 0) {
			if (ix%3 == 0)
				System.out.println("6은 2,3의 배수이다");
		}
		
		
		
		for (int i = 0; i < 10; i++) {   //i는 위에서 선언되있기에 for에선 i를 0으로 
			for (int j = 0; j < 10; j++) {  // j는 아직 선언한게 없어서 해줘야함
				System.out.println(i*j);
				System.out.println();                  // {    } 변수의 범위 scope 이 곳에서 선언한 것은 여기서만 가능
				j++;
	}
	                                                 //j++;
}
