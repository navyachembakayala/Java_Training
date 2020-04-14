package Session12_DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AddSubTime_Class4 {

	public static void main(String[] args) {
		LocalTime t1= LocalTime.now().plusMinutes(10);
		System.out.println(t1);
		
		LocalTime t2= LocalTime.now().minusMinutes(10);
		System.out.println(t2);
		
		LocalTime t3= LocalTime.now().plus(15,ChronoUnit.HOURS);
		System.out.println(t3);
	}

}
