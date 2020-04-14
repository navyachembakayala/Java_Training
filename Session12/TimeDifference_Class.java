package Session12_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class TimeDifference_Class {

	public static void main(String[] args) {

		LocalTime t1 = LocalTime.of(10, 21);
		Duration d = Duration.between(t1,LocalTime.now());
		System.out.println("Mins......"+d+".........Seconds..." + d.getSeconds());
		System.out.println(d.toHours());
		System.out.println(d.toMinutes());
			
	}

}
