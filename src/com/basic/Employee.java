package com.basic;

public class Employee {

	 String name1;
	 double salary;
	 
public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

public static void main(String[] args )
{
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	e1.setName1("sathish");
	e1.setSalary(10000);
	String s= e1.getName1();
	Double d= e1.getSalary();
	d = d*1.1 ;
	System.out.println(s);
	System.out.println("Salary"+d);
	e2.setName1("stephen");
	e2.setSalary(20000);
	String a= e2.getName1();
	Double b= e2.getSalary();
	b = b*1.1 ;
	System.out.println(a);
	System.out.println("Salary"+b);
}
}
