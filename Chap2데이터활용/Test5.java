package Chap2데이터활용;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1 = 10;
		int A2 = -A1;
		A2 += 10;// A2 = A2 + 10; 와 같다
		//A1++;// A1 = A2 + 1 같다
		int A3 = A1++ + A2++; //++A 
		System.out.println(A3);
		System.out.println("A1 = " + A1 + " A2 = " + A2);
		System.out.println(A1 == A2); // 논리 연산자
		char gender = 'M';
		int balance = 100;    //&&는 앞에께 false면 바로 false 되버려서  뒤에꺼도 해야하면 & 한개로  
		System.out.println(!(gender != 'F' || balance++ > 10);
		// ! 는 (), 값의 결과를 뒤집어서 나타낸다.
		
	}

}
