package Session12_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_Class {

	public static void main(String[] args) {
		
		String str = "11-01-1991";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-yyyy]");
		LocalDate d1 = LocalDate.parse(str,formatter);
		System.out.println(d1);
	}

}
