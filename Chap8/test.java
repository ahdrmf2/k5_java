package Chap8;

public class test {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				System.out.print(i + "x" + j + " = " + i * j + " ");
				// 위에 식을 계산 후 바로 줄바꿈이 된다.
			}
			System.out.println();
		}
	}
}