package com.rajiv.factory;

public class DeliveryByTruck implements PackageDelivery {

	@Override
	public String deliveryWay(PackageInfo packageInfo) {
		return "Delivering package using truck for " + packageInfo.getSize() + " package and weight is " + packageInfo.getWeight();

	}
}
