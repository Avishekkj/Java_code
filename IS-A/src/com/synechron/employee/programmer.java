package com.synechron.employee;
public class programmer extends Employee{
	
	private int bonus;
	

	public programmer(int id, String name, float salary, int bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}
	
	public void display()
	{
		System.out.println(bonus);
		System.out.println( id + " " + name + salary);
		
	}

	

}
