package hw4;

import java.util.Scanner;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列表如下:
// 25 	32	 8	 19	 27
//2500 800 500 1000 1200
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數:
//例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
//(提示:Scanner,二維陣列)

public class HW4_4 {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		int[][] money = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		System.out.println("請問你想借的金額:");
		int a = m.nextInt();
		int sum = 0 ;
		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < money.length; i++) {
			if (a <= money[i][1]) {
				sum += 1;
					System.out.print(money[i][0] + " ");
				
			}
		}
		System.out.println("共 "+sum+" 人!");
	}
}
