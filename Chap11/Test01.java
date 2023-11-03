package Chap11;

public class Test01 {

	public static void main(String[] args) {
		
		try {
		int arr[] = new int[3]; // 0,1,2만있는데 
		arr[3] = 30;			//30을 해서 오류
		System.out.println("OK");
		//이상태에서는 종료가되는데 예외처리로 종료되지않게
		} catch(ArrayIndexOutOfBoundsException e) { //예외 객체 스위치 문으로 사용해서
			System.out.println("잘못된 배열의 인덱스 사용!");
			//e.printStackTrace();//오류메세지도 출력해주느것
		}  //트라이 캐치 이용  트라이에서 캐치로 가면 캐치가 예외 오류 찾아내는것 
		System.out.println("GOOD");
	}
}
