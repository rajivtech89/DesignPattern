package com.rajiv.strategy;

public class SDE3 implements Role {

	@Override
	public String description() {
		return SDE3.class.getSimpleName();
	}

	@Override
	public String responsibilities() {
		return "Design large scale system";
	}

}
