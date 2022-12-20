package com.rajiv.proxy;

public class ProxyDesignPattern {

	public static void main(String[] args) {
		EmployeeDaO obj = new EmployeeDaoProxy();
		try {
			obj.create("ADMIN", new Employee());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
