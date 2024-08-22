package hw2;

//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class HW2_7 {
	public static void main(String[] args) {
		for(char i = 'A'; i <= 'F';i++) {
			for(int j = 'A'; j <= i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
