package com.learning.beans;

public class Alpha 
{
	private Beta beta;
  public Alpha()
  {
	  System.out.println("Alpha obj is created-- 0 param ");
  }
//	public Alpha(Beta beta) 
//	{
//	super();
//	this.beta = beta;
//	System.out.println("Alpha param cons");
//}
	public void setBeta(Beta beta) 
	{
		this.beta = beta;
		System.out.println("alpha.setBeta()");
	}

	@Override
	public String toString() {
		return "Alpha [beta=" + beta + "]";
	}
	
	

}
