package com.rajiv.strategy;

public class Main {

	public static void main(String[] args) {
		Employee rajiv = new Employee("Rajiv", new SDE1());
		Employee virat = new Employee("Virat", new SDE2());
		
		System.out.println("=====Before promotion =====");
		rajiv.grade();
		rajiv.doWork();
		virat.grade();
		virat.doWork();
		
		rajiv.promote(new SDE2());
		virat.promote(new SDE3());
		
		System.out.println("=====After promotion =====");
		rajiv.grade();
		rajiv.doWork();
		virat.grade();
		virat.doWork();
		
	}
}
