package hw9;

import java.util.Scanner;

//開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//• 參考範例:CounterRunnable.java
//• 需留意主執行緒執行順序

public class HW9_1 implements Runnable {
	int counter = 10;
	int count = 1;
	String name;

	public HW9_1() {
	}

	public void run() {

		while (counter >= 1) {
			System.out.println(name + "吃第" + count + "碗飯");

			if (counter == 1) {
				System.out.println(name + "吃完了!");
			}

			counter--;
			count++;

			try {
				Thread.sleep((long) ((Math.random() * 2501) + 500));
			} catch (Exception e) {
			}
		}

	}

	public String getN() {
		return name;
	}

	public void setN(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		HW9_1 n1 = new HW9_1();
		Thread t1 = new Thread(n1);

		HW9_1 n2 = new HW9_1();
		Thread t2 = new Thread(n2);

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("請輸入參賽人員:");
			n1.setN(s.next());
			n2.setN(s.next());
		}
		
		System.out.println("---------大胃王快食比賽開始了---------");

		t1.start();
		t2.start();
		
		try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		System.out.println("---------大胃王快食比賽結束了---------");
	}

}
