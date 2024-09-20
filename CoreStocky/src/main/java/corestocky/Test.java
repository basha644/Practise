package corestocky;

import java.awt.Robot;
import java.util.Random;

public class Test {
	private static int TIME = 10000;

	public static void main(String[] args) throws Throwable {
		Robot robot = new Robot();
		Random random = new Random();
		while (true) {
			robot.mouseMove(random.nextInt(1000), random.nextInt(2000));
			Thread.sleep(TIME);
		}
	}
}