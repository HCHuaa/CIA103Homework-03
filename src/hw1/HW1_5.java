package hw1;

//某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
//本金*(1+利率)的10次方

public class HW1_5 {
	public static void main(String[] args) {
		int pv = 1500000;
		double r = 0.02;
		double f = pv*(1+r);
		for(int y=1; y<10; y++) {
			f *= (1+r);
			}
		System.out.println("本金加利息共有"+(int)f+"元");
		
	}
}
