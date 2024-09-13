package hw8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import hw8.HW8_2.Train;

//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)

public class HW8_3 {
	public static void main(String[] args) {
		Train[] trains = { new Train(202, "普悠瑪", "樹林", "花蓮", 400), new Train(1254, "區間", "屏東", "基隆", 700),
				new Train(118, "自強", "高雄", "台北", 500), new Train(1288, "區間", "新竹", "基隆", 400),
				new Train(122, "自強", "台中", "花蓮", 600), new Train(1222, "區間", "樹林", "七堵", 300),
				new Train(1254, "區間", "屏東", "基隆", 700) };

		// • 請寫一隻程式,能印出不重複的Train物件
		Set<Train> set = new HashSet<>();
		for (int i = 0; i < trains.length; i++) {
			set.add(trains[i]);
		}

		Iterator<Train> objs = set.iterator();
		while (objs.hasNext()) {
			System.out.println(objs.next());
		}

		System.out.println();

		// • 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		Arrays.sort(trains);
		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i]);
		}

		System.out.println();

		// • 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		// (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
		Set<Train> set2 = new TreeSet<Train>();
		for (int i = 0; i < 7; i++) {
			set2.add(trains[i]);
		}

		for (Train t : set2) {
			System.out.println(t);
		}

	}
}
