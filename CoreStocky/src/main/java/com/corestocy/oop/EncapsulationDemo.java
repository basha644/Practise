package com.corestocy.oop;

/*Encapsulation 
Binding of variables with methods */

class FseData {
	/*
	 * Generally private data we can't access outside of the class. But, Here we can
	 * access with the help of setters & getters methods.
	 */
	private String fseName;
	private int fseMsisdn;

	public String getFseName() {
		return fseName;
	}

	public void setFseName(String fseName) {
		/*
		 * Here, we are assigning local variable value to global variable with he help
		 * of this keyword This keyword: It refers the current class variables,methods
		 * and constructors.
		 */
		this.fseName = fseName;
	}

	public int getFseMsisdn() {
		return fseMsisdn;
	}

	public void setFseMsisdn(int fseMsisdn) {
		this.fseMsisdn = fseMsisdn;
	}

	/*
	 * Here, we override the toString method otherwise it will return object
	 * address(com.corestocy.oop.FseData@7e774085)
	 */
	@Override
	public String toString() {
		return "FseData [fseName=" + fseName + ", fseMsisdn=" + fseMsisdn + "]";
	}

}

public class EncapsulationDemo {
	public static void main(String[] args) {

		FseData fd = new FseData();
		/*
		 * Here, we are not setting/accessing private variable directly. we setting
		 * value to local variable by using set method After that local variable value
		 * will be set to global variable
		 */
		fd.setFseName("Mahesh");
		fd.setFseMsisdn(123);
		System.out.println(fd);
		fd.setFseName("Vimal");
		fd.setFseMsisdn(345);
		System.out.println(fd);

	}

}
