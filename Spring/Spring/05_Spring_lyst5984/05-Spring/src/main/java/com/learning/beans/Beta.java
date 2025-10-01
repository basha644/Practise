package com.learning.beans;

public class Beta 
{
	private Alpha alpha;
	
	public Beta()
	{
		System.out.println("Beta obj is created -- o param");
	}
	
	public Beta(Alpha alpha) {
		super();
		this.alpha = alpha;
		System.out.println("Beta param Constructor");
	}
//	public void setAlpha(Alpha alpha) 
//	{
//		this.alpha = alpha;
//		System.out.println("beta.setAlpha()");
//	}

	@Override
	public String toString() {
		return "Beta [alpha=" + alpha + "]";
	}
	
}
