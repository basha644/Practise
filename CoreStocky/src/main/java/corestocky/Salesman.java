package corestocky;

public class Salesman{
	
	public void route() {
		System.out.println("Salesman Routes");
	}
	public void camping() {
		System.out.println("Salesman camping");
	}
	public void collection() {
		System.out.println("Salesman collection");
		
	}
	
	Salesman purchase() {
		System.out.println("parent purchase");
		return new Salesman(); //// Co-varient return type
		
	}
	

}
