package Chap13.boundGen;


class Bag<T extends Solid> {
		private T thing;
		private String owner;
		
		public Bag(T thing) {
			this.thing = thing;
		}
		
		public T getThing() {
			return thing;
		}
		
		public void setThing(T thing) {
			this.thing = thing;
		}
		
		void showType() {
			System.out.println("T의 타입은 " + thing.getClass().getName());
		}
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	boolean isSameOwner(Bag<?> obj) {
			//?는 와일드카드로 뭐든 다 허용됨.
			//함수 호출 isSameOwner(Bag<T> obj)  T가 book이다.  issame메서드임. 
		if(this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}
}
	
	

	class Solid{ }
	class Liquid{ }

	class Book extends Solid{ }
	class PencilCase extends Solid{ }
	class Notebook extends Solid{ }
	
	class Water extends Liquid{ }
	class Coffee extends Liquid{ }
	
	public class BagTest {
		public static void main(String[] args) {
			Bag<Book> bag = new Bag<>(new Book());
			Bag<PencilCase> bag2 = new Bag<> (new PencilCase());
			//Bag<Notebook> bag3 = new Bag<>(new Notebook());
			
			bag.setOwner("김푸름");
			bag2.setOwner("김푸름");
			
			boolean result = bag.isSameOwner(bag2);
								//메서드 호출  T가 book으로 만들어졌는데 전달은 펜이 되서 오류 발성
			if(result) System.out.println("소유자가 동일합니다.");
			else System.out.println("소유자가 다릅니다.");
			
			Object obj;
			obj.equals(obj);
			String s1 = "hello";
			String s2 = "good";
			if(s1.compareTo(s2)<0);
			
			
			//Bag<Water> bag4 = new Bag<>(new Water()); //오류발생
			//워터는 T솔리드의 케이스가 아니여서 오류
			//Bag<Coffee> bag5 = new Bag<>(new Coffee());//오류발생
		}
}
