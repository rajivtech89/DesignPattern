package com.rajiv.strategy;

public class SDE2 implements Role {

	@Override
	public String description() {
		return SDE2.class.getSimpleName();
	}

	@Override
	public String responsibilities() {
		return "Review Code";
	}

}
