package corestocky;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;

public class Demo1 {
	public static void main(String[] args) 
	{

		// Get the current date
		Date currentDate = new Date();

		// Create a Calendar instance
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(currentDate);

		// Subtract one day
		calendar.add(Calendar.DAY_OF_MONTH, -1);

		// Get the resulting date
		Date fromDt = calendar.getTime();

		// Print the value of fromDt
//		Calendar aCalendar = Calendar.getInstance();
		Calendar aCalendar = Calendar.getInstance();

		aCalendar.add(Calendar.MONTH, -1);
		aCalendar.set(Calendar.DATE, 1);
		Date firstDateOfPreviousMonth = aCalendar.getTime();
		System.out.println(firstDateOfPreviousMonth);

	}

}
