package hw5;

//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳,如圖:

public class HW5_3 {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 56, 5, 6 } };
		double[][] b = { { 1.5, 2.5, 8.9 }, { 4.5, 5.5, 20.8 } };

		System.out.println(maxElement(a));
		System.out.println(maxElement(b));
	}

	public static int maxElement(int x[][]) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {

				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;

	}

	public static double maxElement(double x[][]) {
		double max = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (max < x[i][j]) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

}