package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 
//(請使用append功能讓每次執行結果都能被保存起來)

public class HW7_2 {
	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("src/hw7/Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			List<Integer> r = new ArrayList<>();

			for (int i = 0; i < 10; i++) {
				r.add((int) (Math.random() * 1000 + 1));
			}

			pw.print(r.toString());
			pw.println();

			pw.close();
			bw.close();
			fw.close();

		} catch (IOException e) {

		}
	}
}
