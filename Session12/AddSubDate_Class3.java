package Session12_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AddSubDate_Class3 {

	public static void main(String[] args) {
		//Plus or minus methods, chrono unit
		
		LocalDate d1 = LocalDate.now().plusMonths(2);
		System.out.println(d1);
		
		LocalDate d2 = LocalDate.now().minusMonths(2);
		System.out.println(d2);
		
		LocalDate d3 = LocalDate.now().minus(10, ChronoUnit.DECADES);
		System.out.println(d3);
	}

}
