package hw4;

import java.util.Arrays;

//班上有8位同學,他們進行了6次考試結果如下:
//4 8 1 2 1 3
// 2 1 1 1 0 0 0 1
//請算出每位同學考最高分的次數
//(提示:二維陣列)
public class HW4_6 {
	public static void main(String[] args) {
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] high = new int[score.length];
		int[] count = new int[score[0].length];

		int h = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				for (int k = 0; k < score[i][j]; k++) {
					if (h < score[i][j]) {
						h++;
					}
				}
			}
			high[i] = h;
			h = 0;
		}

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				if (high[i] == score[i][j]) {
					count[j]++;
				}
			}
		}

		for (int a = 0; a < count.length; a++) {
			System.out.println((a + 1) + "號同學考了第" + count[a] + "次最高分");
		}

	}

}