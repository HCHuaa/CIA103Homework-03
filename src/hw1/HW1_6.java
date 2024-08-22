package hw1;

//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因

public class HW1_6 {
	public static void main(String[] args) {
		System.out.println(5 + 5); //兩者皆為int數值，因此為算式運算5+5=10
		System.out.println(5 + '5'); //前者為int數值，後者為char字元(Unicode數值53)，因此5+53=58
		System.out.println(5 + "5"); //前者為int數值，後者為String字串﹐因此5相接字串5=55
	}
}
