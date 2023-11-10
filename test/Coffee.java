package test;

import java.util.Arrays;

public class Coffee {
	
	public Coffee(String string, int i) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		        Coffee[] coffees = new Coffee[]{
		                new Coffee("Americano",3500),
		                new Coffee("Green tea Latte",5500),
		                new Coffee("Vanilla Latte",4500),
		                new Coffee("Espresso",3000)
		        };

		        Arrays.sort(coffees); // ERROR
		        for (Coffee coffee : coffees) {
		        	// 클래스 변수 : 메서드?
		            System.out.println(coffee.toString());
		        }			
		    }
		  						//extends 상속 implements 구현
		  						
	public class Coffee1 implements Comparable {
	    private final String name;
	    private final int price;

	    public Coffee1(String name, int price) {
	        this.name = name;
	        this.price = price;
	    }

	    public Integer getPriceAsInteger() {
	        return this.price;
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	        return ((Coffee) obj).getPriceAsInteger().equals(getPriceAsInteger());
	    }															

	    @Override
	    public int compareTo(Object o) {
	        Coffee e = (Coffee) o;
	        return getPriceAsInteger().compareTo(e.getPriceAsInteger());
	    }									
	    		//compare 객체 비교 메서드
	    @Override
	    public String toString() {
	        return "Coffee{" +
	                "name='" + name + '\'' +
	                ", price=" + price +
	                '}';
	    }
	}	  						
}				
					
