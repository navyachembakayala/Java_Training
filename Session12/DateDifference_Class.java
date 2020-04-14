package Session12_DateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class DateDifference_Class {

	public static void main(String[] args) {
			
		LocalDate d = LocalDate.of(1970, Month.JANUARY,	22);
		Period p = Period.between(d,LocalDate.now());
		System.out.println("Years..." + p.getYears()+"...months...." + p.getMonths() +"....days..."+ p.getDays());
		System.out.println(p.toTotalMonths());
	}

}
