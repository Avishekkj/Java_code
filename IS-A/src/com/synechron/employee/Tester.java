package com.synechron.employee;
public class Tester extends Employee
{
 private int bug;

public Tester(int id, String name, float salary, int bug) {
	super(id, name, salary);
	this.bug = bug;
}
 
public void display()
{
	System.out.println(bug);
	System.out.println( id + " " + name + salary);
	
}
	
}
