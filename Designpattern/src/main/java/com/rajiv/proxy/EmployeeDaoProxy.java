package com.rajiv.proxy;

public class EmployeeDaoProxy implements EmployeeDaO {

	EmployeeDaO empdao;

	EmployeeDaoProxy() {
		empdao = new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, Employee Obj) throws Exception {
		if (client.equals("ADMIN")) {
			empdao.create(client, Obj);
			return;
		}
		throw new Exception("Access denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if (client.equals("ADMIN")) {
			empdao.delete(client, employeeId);
			return;
		}
		throw new Exception("Access denied");
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		if (client.equals("ADMIN") || client.equals("USER")) {
			return empdao.get(client, employeeId);
		}
		throw new Exception("Access denied");
	}

}
