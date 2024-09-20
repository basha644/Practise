package corestocky;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Testing {
	
//	private Date currentDate() {
//		Calendar cal = Calendar.getInstance();
//		DateFormat df = new SimpleDateFormat("dd-MM-yy");
//		Date startDate = null;
//		String date="23-10-22";
//		try {
//			startDate = df.parse(date);
//			System.out.println(startDate);
//		} catch (Exception e) {
//			System.out.println("Error in converting date");
//		}
//		return startDate;
//	}
//	public static void main(String[] args) {
//		Testing test = new Testing();
//		test.currentDate();
//		System.out.println(test.toString());
//		
//		java.sql.Date sqlDate1 = new java.sql.Date(new Date().getTime());
//		System.out.println(sqlDate1);
//		java.sql.Date sqlDate = new java.sql.Date(new Date().getTime());
//		System.out.println(sqlDate);
//
//
//	}
	public static void main(String[] args) {
		String[] channelCodes = {"akbar","basha","patan"};
		List<String> channelCodesList = new ArrayList<>(channelCodes.length);
		for (int i = 0; i < channelCodes.length; i++) {
			channelCodesList.add(channelCodes[i]);
		}
		List<String> channelCodesList1 = new ArrayList<>(Arrays.asList(channelCodes));

		channelCodesList.add("faruq");
		channelCodesList.add("fouyji");

		System.out.println(channelCodesList);
		channelCodesList1.add("faruq");
		channelCodesList1.add("fouyji");

		System.out.println(channelCodesList1);
	}

}
