package com;

public class Employee {
	
	//Class variable, Member variable , properties of the class
public 	int id;
public 	double salary;
public 	String name;
	
	
	//constructor
	
	Employee(){}
	
	public Employee(int id,double salary,String name){
		
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	public double getBonus()
	{
		return salary*.1;
	}
	
	public void printEmployeeDetails()
	{
		String space="  ";
		System.out.println(id+space+ name+space+salary);
		
	}
	
	

}
