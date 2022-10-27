package com.rajiv.strategy;

public class Employee {
	private String name;
	private Role role;

	public Employee(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}

	public void promote(Role newRole) {
		this.role = newRole;
	}

	public String grade() {
		return this.name + " is a " + role.description();
	}

	public void doWork() {
		System.out.println(this.name + " Will " + role.responsibilities());
	}

}
