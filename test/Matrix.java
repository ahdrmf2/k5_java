package test;

public class Matrix {
	private int[][] arr;

	// 배열 행 열
	public Matrix(int[] array, int index, int row, int column) {

		arr = new int[row][column];
		// row, coloumn

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = array[index++];
			}
		}
	}

	public Matrix(int[][] arr) {
		this.arr = arr;
	}

	public void print() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
		
	public static Matrix sum(Matrix mA, Matrix mB) {
		int[][] retarr = new int[mA.arr.length][mA.arr[0].length];
		for (int i = 0; i < retarr.length; i++) {
			for (int j = 0; j < retarr[0].length; j++) {
				retarr[i][j] = mA.arr[i][j] + mB.arr[i][j];
			}
		}
		return new Matrix(retarr);
	}
	
	public static Matrix mutiple(Matrix mA, Matrix mD) {
		int[][] retarr = new int[mA.arr.length][mD.arr[0].length];
		for (int i = 0; i < mA.arr.length; i++) {
			for (int j = 0; j < mD.arr[0].length; j++) {
				retarr[i][j] = mA.arr[i][j] * mD.arr[i][j];
			}
		}
		return new Matrix(retarr);
	}
}
