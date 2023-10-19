package Chap3제어문;
// AIT +shift + j 자동 주석
public class Test22 {
public static void main(String[] args) {
	int a = 12;
	int b = 2;
	char op = '-';  //스위치 케이스 위주로 쓰자
	switch (op) {  //op부분이 +먼 +등 각각에 맞게 계산하랏
	case'+':
		System.out.println(a+b);
		break;
	case'-':
		System.out.println(a-b);
		break;
	case '*':
		System.out.println(a*b);
		break;
	case '/':
		System.out.println(a / +b);
		break;
	default:  //정해지지않은것. 많이 쓰임
		System.out.println("부적합 연산자");
	}
}	
	/*char op = '+';*/
/*	switch (op) {
	case'+';
		System.out.println(a+b);
		break*/
/*	case'-';
		System.out.println(a-b);
		break
	case'*';
		System.out.println(a*b);
		break
	case'/';
		System.out.println(a/b);
		break
	default:
			System.out.println("부적합 연산자");
	}*/
}

