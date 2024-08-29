package hw4;

import java.util.Arrays;

//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)

public class HW4_1 {
	public static void main(String[] args) {
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(a);
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		int avg = sum / a.length;
		System.out.println("平均值 : " + avg);
		System.out.print("大於平均值的元素 : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > avg) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
