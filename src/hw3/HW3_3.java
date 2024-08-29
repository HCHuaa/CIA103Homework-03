package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字
//請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數

//(提示:Scanner) 剔除數字、array、亂數、迴圈
//(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)

//int[][] random = new [][6]; 



public class HW3_3 {
	public static void main(String[] args) {
		System.out.println("阿文，你現在討厭哪個數字?");

		Scanner input = new Scanner(System.in);
		int w = input.nextInt();
		int num = 0;
		while (w >= 1 && w <= 9) {
			for (int i = 1; i <= 49; i++) {
				if (i / 10 != w && i % 10 != w) {
					System.out.print(i + " ");
					num++;
				}

			}
		}
		System.out.println();
		System.out.println("總共有" + num + "個");

	}

}
