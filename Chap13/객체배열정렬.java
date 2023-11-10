package Chap13;

import java.util.Arrays;
import java.util.Random;
class Student implements Comparable<Student>{
	String sno;
	String sname;
	
		//생성자
	public Student(String sno, String sname) {
		// TODO Auto-generated constructor stub
		this.sno = sno;				//값을 위의 클래스 부분 sno에 준다.
		this.sname = sname;
		
	}
	@Override
	public String toString() {
		return "("+ sno +", " + sname+ ")";//객체를 스트링으로
	}
	@Override     //인터페이스 (T) compareTo는 T의 객체끼리 비교한다는뜻
	public int compareTo(Student s) {
		return Integer.parseInt(this.sno) - Integer.parseInt(s.sno);
	}//Integer.parseInt String 함수 부분을 int 타입으로 바꿔주는것
}

public class 객체배열정렬 {

	static void sortStudent(Student[]data) {
		Student temp;
		for (int i = 0; i < data.length;i++) 
			for (int j = i + 1; j < data.length; j++){
				if(data[i].compareTo(data[j])>0){
					//i가 j보다 큰 경우를 골라내려는 것 
					//스트링 문자열을 비교해서 >0보다 크다
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
			}	//숫자가 아닌 문자열 비교
		}
	}
					//int[]data = new int[20];
					//student			  student
	public static void main(String[] args) {
		Student [] data = {  //배열
				//data[0] = new student("22","홍길동")
					//0번째 배열이 객체를 가진다는 뜻
				
						//생성자 부분
				new Student("12", "홍길동"),
				new Student("121", "홍길순"),
				new Student("213", "홍길춘"),
				new Student("9", "홍길홍"),
				
				
		};  
		//함수호출 데이터를 받고 
		for (Student st: data)
			System.out.print(" " + st);
		
		//sort는 정렬 해주는
		sortStudent(data);
		System.out.println();
		//Arrays.sort(data);//이게 문제가 있어서 sortStudent()를 구현
		for (Student st: data)
			System.out.print(" " + st);
	}
}

