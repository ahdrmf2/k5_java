package Chap7_Test1;


public abstract class Geometry {
	
	private int[] xArr;
	private int[] yArr;
	
	int[] getXArr() { return xArr;}
	int[] getYArr() {return yArr;}
	
	void addpoint(int x, int y) {//필드는 초기값 null
		
		if (xArr == null) {
			xArr = new int[1];
			yArr = new int[1];
			xArr[0] = x;
			yArr[0] = y;
		}
		else {
			int tlen = xArr.length;
			int [] txArr = new int[tlen+1];
			int [] tyArr = new int[tlen+1];
			for (int i = 0; i < xArr.length; i++) {
				txArr[i] = xArr[i];
				tyArr[i] = yArr[i];
			}
			txArr[tlen] = x;
			tyArr[tlen] = y;
			xArr = txArr;
			yArr = tyArr;
			
		}
	}
	public abstract double getLength();
	public abstract double getArea();

	public void printPoint() {
		for(int i = 0 ; i < xArr.length; i++) {
			System.out.println(xArr[i] + "," + yArr[i]);
		}
	}

}
