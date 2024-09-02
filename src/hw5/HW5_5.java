package hw5;

import java.util.Random;

//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合,如圖:
//本次隨機產生驗證碼:
//	GLSe3X81

public class HW5_5 {
	public static String genAutoCode() {
		char[] c = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
				'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9' };
		Random r = new Random();

		char[] code = new char[8];

		for (int i = 0; i < 8; i++) {
			code[i] = c[r.nextInt(c.length)];
		}

		return new String(code);
	}

	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼:" + genAutoCode());
	}
}
