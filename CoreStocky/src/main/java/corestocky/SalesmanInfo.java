package corestocky;

import java.util.HashMap;
import java.util.Map;

public class SalesmanInfo extends Salesman{
	
	public void route() {
		System.out.println("Routes");
	}
	public void camping() {
		super.camping();
		System.out.println("camping");
	}
	public void autoDebit() {
		System.out.println("Auto Debit");
	}
	SalesmanInfo purchase() {
		System.out.println("child purchase");
		return new SalesmanInfo();  // Co-varient return type
		
	}
	
	public static void main(String[] args) {
		int k[]= {0,5,9,3};
		for(int i=0;i<5;i++)
			System.out.println(i);
		for(int j:k)
			System.out.println(j);
		
		Map<String, Object> mapp = new HashMap();
		mapp.put("akbar", 1);
		mapp.put("basha", 2);
		System.out.println(mapp);
		
		
		Salesman s =new Salesman();
		s.camping();
		SalesmanInfo si = new SalesmanInfo();
		si.autoDebit();
		si.camping();
		Salesman ss = new SalesmanInfo();
		ss.camping();
		ss.purchase();
		((SalesmanInfo) ss).autoDebit(); //Down cast
	}
	

}



