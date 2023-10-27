package Chap7_Test1;

public class GeomTest {
	public static void main(String[]args) {
	
	Point p = new Point(10, 20);
	p.addpoint(10, 20);
	p.printPoint();
	System.out.println("점 길이 : " + p.getLength());
	System.out.println("점 면적 : " + p.getArea());

	
	
	}
}
