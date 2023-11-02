package Chap10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {

		// List가 ArrayList의 부모상속이기에 List로도 가능. < > 부분에 데이터 타입을 정해줘서 = 뒷부분에 <> 데이터 타입 생략
		// 가능.
		List<String> list = new ArrayList();
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// ==========================================================
		list.forEach(s -> System.out.println("fe:" + s));// 람다식 포이치 각각에 대해 적는것
		// ==========================================================
		list.add("런던");
		list.add("로마");
		list.add("방콕");
		list.add("북경");
		list.add("도쿄");
		list.add("서울");
		System.out.println("1 : " + list.toString());

		// add순서대로 들어간다

		list.add(1, "LA");
		print(2, list);

		System.out.println("3 : " + list.indexOf("서울"));
		System.out.println("4 : " + list.lastIndexOf("서울"));

		list.remove("LA");
		print(5, list);

		list.remove(2);
		print(6, list);
		System.out.println("7 : " + list.contains("LA"));

		Object obj[] = list.toArray();
		System.out.println("8 : " + Arrays.toString(obj));

		String cities[] = new String[0];
		cities = list.toArray(cities);
		System.out.println("9 : " + Arrays.toString(cities));

		list.clear();
		print(10, list);

		System.out.println("11 : " + list.isEmpty());

		list.add("파리");
		list.add("방콕");
		list.add("LA");

		List<String> list2 = Arrays.asList("서울", "뉴욕", "상해");
		print(12, list2);

		list.addAll(list2);
		print(13, list);

		System.out.println("14 : " + list.containsAll(list2));

		list.retainAll(list2);
		print(16, list);
	}

	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);

	}
}
