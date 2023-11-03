package Chap10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test07 {
	public static void main(String[] args) {
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("고진감래", "고생 끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질정도로 노력을 다함");
		dic.put("권토중래", "실패를 발판삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		dic.put(null, null); //HashMap은 null 값도 저장 가능하다
		
		
		//방법 1
		Iterator<String> keys = dic.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}			//키에서
		
		
		//방법2
		for(Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s : %s", elem.getKey(), elem.getValue()));
		}
		// 
			
		//방법3
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		} // 많이 쓰이느ㅜㄴ 방법
		
	}

}
