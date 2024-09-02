package hw5;

import java.util.Scanner;

//請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//圖: 5 4
//*****
//*****
//*****
//*****

public class HW5_1 {

	public static void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入寬:");
		int w = s.nextInt();
		System.out.println("請輸入高:");
		int h = s.nextInt();

		starSquare(w, h);

	}

}
