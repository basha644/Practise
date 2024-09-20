package corestocky;

import java.awt.Robot;
import java.util.Random;

public class Company {
	public static final int TEN_SECONDS = 20000;

	// Generate random integers in range 0 to 999
	public static void main(String... args) throws Exception {
		Robot robot = new Robot();
		Random random = new Random();
		while (true) {
			robot.mouseMove(random.nextInt(1000), random.nextInt(2000));
			Thread.sleep(TEN_SECONDS);
		}	
	}
}	
	