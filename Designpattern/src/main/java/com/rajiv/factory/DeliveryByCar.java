package com.rajiv.factory;

public class DeliveryByCar implements PackageDelivery{

	@Override
	public String deliveryWay(PackageInfo packageInfo) {
		return "Delivering package using car for " + packageInfo.getSize() + " package and weight is "
				+ packageInfo.getWeight();

	}
}
