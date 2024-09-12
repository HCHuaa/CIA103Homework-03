package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾

public class HW7_4 {
	public static void main(String[] args) {
		try {
			File file = new File("C:/data/Object.ser");
			// 創建資料夾
			File directory = new File("C:\\data");
			if (!directory.exists()) {
				directory.mkdirs();
			}

			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Dog dog = new Dog("vivi");
			Dog dog1 = new Dog("zart");
			Cat cat = new Cat("levi");
			Cat cat1 = new Cat("leon");

			oos.writeObject(dog);
			oos.writeObject(dog1);
			oos.writeObject(cat);
			oos.writeObject(cat1);
			System.out.println("所有物件已成功寫入");

			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
