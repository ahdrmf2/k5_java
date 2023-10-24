package Chap4배열;

public class Test36 {
public static void main(String[] args) {
	
	
	
	char letter = 'A';
	char[] ala = new char[26];
	
	for(int i = 0; i < ala.length; i++) {
		ala[i] = (char) (letter + i);
	}
	for(char c : ala) {
		System.out.print(c);
	}    //chap 는 정수와 같은 취급 ascll code  캐릭터가 인티로 가도 괜찮은데 인티저는 캐릭터로 못감 오버플로어
}
}
