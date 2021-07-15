package com.test.ds.demo;

public class Employee implements Comparable {
	String name;
	int eid;
	
	public Employee(String name,int id)
	{
		this.name=name;
		this.eid=id;
	}
	public String toString()
	{
		return name+"_"+eid;
	}
	
	@Override
	public int compareTo(Object o) {
		int eid1=this.eid;
		Employee emp=(Employee)o;
		int eid2=emp.eid;
		if(eid1>eid2)   //right 
		{
			return -1;
		}else if(eid1>eid2)
		{
			return +1;   // left 
		}
		else
		return 0;
	}

}
