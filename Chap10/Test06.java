package Chap10;

import java.util.HashMap;
import java.util.Set;

public class Test06 {
	
	public static void main(String[] args) {
		
		String word[] = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};       //Key영역
		String meaning[] = {"꿀벌과에 속하는 호박벌", " 천국", "그럼에도 불구하고", "호기심이 들다"}; //Value 영역
		
		HashMap<String, String> dic = new HashMap<String, String>();
		//Arraylist랑 다른 HashMap형태이다
		
		for(int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]); //put용해 디러셔리에 값 넣음.
	}
		System.out.println(dic);
		System.out.println(dic.size()); //4
		
		System.out.println(dic.keySet());
		//많이 쓰이는 코드   키 자체를 셋으로 출력하면 dic가 가진 키를 출력해주는것
//		System.out.println("-".repeat(30));
//		Set<String> Key =dic.keySet();	// dic 키가 가지고 있는걸 보여줌
//		for(String key : keys) {
//			System.out.println("\t" + key + ":" + dic.get(key));
//		}
//		System.out.println("-".repeat(30));
		
		//-======================================================
		
		System.out.println(dic.values());
		
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주 행복한 감정");
		
		System.out.println("HEAVEN : " + dic.get("HEAVEN") );
		dic.put("HEAVEN", "이상적인 세상");
		//위로 많이 쓰임
		
		System.out.println("HEAVEN : " + dic.get("HEAVEN") );
		
		System.out.println(dic.containsKey("BUMBLEBEE"));
		System.out.println(dic.containsValue("자장가"));
		
		dic.remove("HAVEN");
		System.out.println(dic.containsKey("HAVEN"));
		
		dic.clear();
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());
	
	}

}
