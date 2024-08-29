package hw3;

import java.util.Scanner;

//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//對則顯示正確訊息,如圖示結果:
//
//(提示:Scanner,亂數方法,無窮迴圈)
//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)

public class HW3_2 {
	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		int ran = (int) (Math.random() * 10);
		System.out.println(ran);

		System.out.println("從0~9猜一個數字:");
		int g = -1;
		while (g != ran) {
			if (r.hasNextInt()) {
				g = r.nextInt();
				if (g > 9 || g < 0) {
					System.out.println("請重新輸入");
				} else if (g != ran) {
					System.out.println("猜錯了!再猜一次");
				} else {
					System.out.println("猜對了!!答案就是" + ran);
					break;
				}
			}
//			if (r.hasNextDouble()) {
//				System.out.println("請重新輸入0~9的整數");
//					break;
//			}
		}
	}
}
