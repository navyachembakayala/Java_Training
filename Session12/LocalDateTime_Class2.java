package Session12_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTime_Class2 {

	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020, 12, 31);
		LocalDate d2 = LocalDate.of(2020, Month.JULY, 18);
		System.out.println(d1);
		System.out.println(d2);
		
		LocalTime t1 = LocalTime.of(20, 23);
		LocalTime t2 = LocalTime.of(15, 20, 23);
		LocalTime t3 = LocalTime.of(15, 20, 23, 354232);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		LocalDateTime dt1 = LocalDateTime.of(d1, t1);
		LocalDateTime dt2 = LocalDateTime.of(2020, Month.JULY, 18, 18,20, 23);
		System.out.println(dt1);
		System.out.println(dt2);
	}

}
