package Chap7_test_1;

public class Unit {
	
	public static Long M2T = 30L;
	public static Long T2M = 120L;
	
	private Long health;
	
	public Unit(Long health) {
		this.health = health;
		
	public Long getHealth() {
		return health;
	}
	public void setHealth(Long health) {
		this.health = health;
		System.out.println("Health");
	}
	public void attack() {
		System.out.println("공격합니다.");
	}
	
	}
}
