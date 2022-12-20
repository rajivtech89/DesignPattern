package com.rajiv.proxy;

public interface EmployeeDaO {
	public void create(String client, Employee Obj) throws Exception;
	public void delete(String client,int employeeId) throws Exception;
	public Employee get(String client,int employeeId) throws Exception;

}
