package com.corestocky.javafeatures;

public class SwitchDemo {
	public static void main(String[] args) {
		int alaramTime=0;
		String weekDay="sun";
		switch (weekDay) {
		case "mon":
			alaramTime=4;
			break;
		case "tue":
			alaramTime=5;
			break;
		case "wed":
			alaramTime=6;
			break;

		default:
			alaramTime=1;
			break;
		}
		
		/*
		 * This feature is available for above jdk12
		 * Here, we are given multiple conditions in one case
		 * and implemented Lamda expression
		 */
		
//		alaramTime=switch (weekDay) {  
//		case "mon","tue" ->4
////			alaramTime=4;
//		case "tue","sat" ->5
//		case "wed" ->7
//
//		default ->9
//		}
	}

}
