package hw4;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

//有機會的話...再把判斷月份日期跟直接重新重run的功能補上去...;)

public class HW4_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入西元年份:");
		int y = s.nextInt();
		System.out.println("請輸入月份:");
		int m = s.nextInt();
		System.out.println("請輸入日期:");
		int d = s.nextInt();
		

		int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int count = 0;

		if (m < 1 || m > 12 || d < 1 || d > 31) {
			System.out.println("請重新輸入正確日期");
		} else {
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				dom[1] = 29;
			}
			
			if (d > dom[m - 1]) {
				System.out.println("日期超出當月份天數，請確認後重新輸入");
			} else {
				for (int i = 0; i < m - 1; i++) {
					count += dom[i];
				}
				count += d;
				System.out.println("輸入的日期為該年第" + count + "天");
			}

		}

	}

}
