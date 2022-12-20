package com.rajiv.proxy;

public class EmployeeDaoImpl implements EmployeeDaO{

	@Override
	public void create(String client, Employee Obj) throws Exception {
		System.out.println("created new employee");
		
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
System.out.println("deleted row with employeeID "+ employeeId);		
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		System.out.println("Fetching data from DB");
		return new Employee();
	}

}
