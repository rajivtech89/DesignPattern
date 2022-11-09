package com.rajiv.factory;

public class DeliveryByBicycle implements PackageDelivery {

	@Override
	public String deliveryWay(PackageInfo packageInfo) {
		return "Delivering package using bicycle for " + packageInfo.getSize() + " package and weight is "
				+ packageInfo.getWeight();

	}

}
