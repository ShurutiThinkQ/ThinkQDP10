package com.containment;

public class Course {
	
	private int cid;
	private String cname;
	private double fees;
	
	public Course()
	{
		
	}
	public Course(int cid,String cname,double fees)
	{
		this.cid=cid;
		this.cname=cname;
		this.fees=fees;
	}
	
	public void setCid(int cid)
	{
		this.cid=cid;
	}
	
	public int getCid()
	{
		return cid;
	}
	
	public void setCname(String cname)
	{
		this.cname=cname;
	}
	
	public String getCname()
	{
		return cname;
	}
	
	public void setFees(double fees)
	{
		this.fees=fees;
	}
	public double getFees()
	{
		return fees;
	}
	
	public String toString()
	{
		return "Course:"+cid+" "+cname+" ,Fees:"+fees;
	}

}
