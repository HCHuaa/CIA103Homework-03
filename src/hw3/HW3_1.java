package hw3;

import java.util.Scanner;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷) 

public class HW3_1 {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		System.out.println("請於下方輸入第一個數字 :");
		double r1 = r.nextInt();
		System.out.println("請於下方輸入第二個數字 :");
		double r2 = r.nextInt();
		System.out.println("請於下方輸入第三個數字 :");
		double r3 = r.nextInt();

		if (r1 + r2 <= r3 || r2 + r3 <= r1 || r1 + r3 <= r2) {
			System.out.println("這不是三角形!");
		} else if (r1 == r2 && r2 == r3) {
			System.out.println("正三角形");
		} else if (r1 * r1 + r2 * r2 == r3 * r3 || r2 * r2 + r3 * r3 == r1 * r1 || r1 * r1 + r3 * r3 == r2 * r2) {
			System.out.println("直角三角形");
		} else if (r1 == r2 || r2 == r3 || r3 == r1) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}

	}
}
