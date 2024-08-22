package hw2;

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

public class HW2_2 {
	public static void main(String[] args) {
		int h = 1;
		for (int a = 1; a <= 10; a++) {
			h *= a;
		}
		System.out.println(h);
	}
}
