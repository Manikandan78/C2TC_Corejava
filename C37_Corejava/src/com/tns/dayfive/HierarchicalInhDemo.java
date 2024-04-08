package com.tns.dayfive;

public class HierarchicalInhDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);
		Person p;
		p = new Person("Dhruv", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details " + p);
		p = new Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee)
			System.out.println("Employee Details " + p);
		System.out.println("Student Details " + p);
	}

}
