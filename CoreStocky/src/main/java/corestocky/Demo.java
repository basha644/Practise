package corestocky;

public class Demo {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println("i :" + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println("j :" + j);
				while (i == j) {

					System.out.println("matching:  " + i + j);
					break;
				}
			}
		}
	}

}
