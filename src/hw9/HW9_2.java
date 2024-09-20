package hw9;

//帳戶餘額超過3000元,停止匯款;
//帳戶餘額2000元以下,要求匯款。
//如果帳戶餘額低於要提款的金額,暫停提款,直到告知他錢已經入帳戶。
//假設媽媽一次匯款 2000 元,熊大一次提款1000元
//寫一個Java程式模擬匯款10次與提款10次的情形。

//• 參考範例:TestWaitNotify.java

public class HW9_2 {
	public static void main(String[] args) {
		Depot depot = new Depot();
		Depositor depositor = new Depositor(depot);
		Withdrawer withdrawer = new Withdrawer(depot);

		depositor.start();
		withdrawer.start();
	}
}

class Depot {
	private int stock = 0;

	synchronized public void in(int qty) {
		while (stock > 3000) {
			System.out.println("媽媽看到餘額超過3000,暫停匯款");
			System.out.println("熊大被媽媽告知帳戶已經有錢!");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock += qty;
		System.out.println("媽媽存了" + qty + "，帳戶共有:" + stock);
		notifyAll();
	}

	synchronized public void out(int qty) {
		while (stock < qty) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款!");

			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		stock -= qty;
		System.out.println("熊大領了" + qty + "，帳戶共有:" + stock);

		if (stock <= 2000) {
			System.out.println("熊大看到餘額在2000元以下,要求匯款");
			notifyAll();
		}

	}

}

class Depositor extends Thread {
	Depot depot;

	public Depositor(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			depot.in(2000);
		}
	}

}

class Withdrawer extends Thread {
	Depot depot;

	public Withdrawer(Depot depot) {
		this.depot = depot;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			depot.out(1000);
		}
	}
}
