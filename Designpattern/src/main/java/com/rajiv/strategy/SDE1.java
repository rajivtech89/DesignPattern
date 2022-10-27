package com.rajiv.strategy;

public class SDE1 implements Role {

	@Override
	public String description() {
		return SDE1.class.getSimpleName();
	}

	@Override
	public String responsibilities() {
		return "Write Code";
	}

}
