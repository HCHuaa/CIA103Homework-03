package hw1;

//請由程式算出256559秒為多少天、多少小時、多少分與多少秒


public class HW1_3 {
	public static void main(String[] srgs) {
		int sec1 = 256559;
		int minsec = 60;
		int hrsec = minsec*60;
		int daysec = hrsec*24;
		
		
		int day = sec1/daysec;
		int hr = sec1%daysec/hrsec;
		int min = sec1%daysec%hrsec/minsec;
		int sec = sec1%daysec%hrsec%minsec;
		
		System.out.println("236559秒是"+day+"天又"+hr+"小時又"+min+"分又"+sec+"秒");
	}
}
