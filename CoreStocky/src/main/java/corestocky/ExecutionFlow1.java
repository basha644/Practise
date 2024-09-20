package corestocky;

class SportsParent {

	public SportsParent() {
		System.out.println("Sports Parent Constructor");
	}

	static {
		System.out.println("Parent Static block");
	}
	
	{
		System.out.println("Parent Non-Static block");

	}

	private static void sport() {
		System.out.println("sportparent Constructor");

	}

}

class SportsChild extends SportsParent {

	private static final String GAME_TYPE = "ICC Games";
	public String team1;
	public String team2;
	public String team3;

	static {
		System.out.println("Child Static block");
	}

	{
		System.out.println("Child Non-Static block");

	}

	public SportsChild() {
		System.out.println("sportchild Constructor");

	}

	private void sport(String qualifier) {
		System.out.println("sportchild qualifier team");

	}

	public SportsChild(String team1, String team2, String team3) {
		this.team1 = team1;
		this.team2 = team2;
		this.team3 = team3;
		System.out.println("team1: " + team1);
		System.out.println("team2: " + team2);
		System.out.println("team3: " + team3);

	}

}

public class ExecutionFlow1 {
	public static  String game = "Cricket";

	private static void sport() {
		System.out.println("sportchild static method");

	}

	public static void main(String[] args) {
		sport();


		SportsChild sc = new SportsChild("India", "pk", "england");

	}

}
