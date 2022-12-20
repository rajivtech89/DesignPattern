package com.rajiv.adapter;

public class Main {

	public static void main(String[] args) {
		WeightMachineAdapter adapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
		System.out.println(adapter.getWeightInKg());
	}
}
