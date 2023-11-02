package Chap10.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test01_ArrayList {

	public static void main(String[] args) {

		Random rd = new Random();
		List<Person> list = new ArrayList();
									//name, age, subject순으로 옮겨간다.
		Professor p1 = new Professor("교수1", 40, "자바");
	
		list.add(p1);

		Professor p2 = new Professor("홍이동", 40, "파이썬");

		list.add(p2);

		for (int i = 1; i <= 10; i++) {
			Student s = new Student("학생" + i, rd.nextInt(20, 30),"컴공과");
			list.add(s);
		}
		list.forEach(p->System.out.println(p));
	
	}
}
