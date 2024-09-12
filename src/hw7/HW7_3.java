package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
//呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案

public class HW7_3 {
	public static void main(String[] args) {
		File sample = new File("src/hw7/Sample.txt");
		File copy = new File("src/hw7/copy.txt");
		copyFile(sample, copy);
	}

	public static void copyFile(File f1, File f2) {

		try {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);

			int r;
			while ((r = fr.read()) != -1) {
				fw.write(r);
			}

			fw.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		if (f1 == null || f2 == null) {
			System.out.println("f1讀取失敗");
		} else {
			System.out.println("copy完成!");
		}

	}
}
