package basics;

import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		for (int i = 0; i <= 12; i++) {
			cal.add(Calendar.DATE, 30);
			System.out.println(cal.getTime());

		}
		System.out.print("   ");
	}
}
