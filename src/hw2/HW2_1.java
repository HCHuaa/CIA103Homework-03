package hw2;

//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

public class HW2_1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
				}
			}
			System.out.println(sum);
		
	}
	
}
