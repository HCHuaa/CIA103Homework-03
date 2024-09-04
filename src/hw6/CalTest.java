package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("請輸入X的值:");
			c.setX(s.nextInt());
			System.out.println("請輸入Y的值:");
			c.setY(s.nextInt());

			System.out.println(c.getX() + "的" + c.getY() + "次方等於" + c.powerXY(c.getX(), c.getY()));
		} catch (CalException e) {
			e.printStackTrace();
		}

	}
}
