package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

public class HW7_1 {
	public static void main(String[] args) {
		String i;
		int sum = 0;
		int line = 0;

		try {
			File sp = new File("src/hw7/Sample.txt");
			FileReader f = new FileReader(sp);
			BufferedReader b = new BufferedReader(f);

			while ((i = b.readLine()) != null) {
				line++;
				sum += i.length();
			}

			System.out.println(sp.getName()+"檔案共有" + sp.length() + "個位元組," + sum + "個字元," + line + "列資料");

			b.close();
			f.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
