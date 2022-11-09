package com.rajiv.factory;

public class DeliveryManager {

	public String delviveryManagerFactory(PackageInfo packageInfo) {
		if (packageInfo.getSize().equalsIgnoreCase("SMALL")) {
			return new DeliveryByBicycle().deliveryWay(packageInfo);
		}
		if (packageInfo.getSize().equalsIgnoreCase("MEDIUM")) {
			return new DeliveryByCar().deliveryWay(packageInfo);
		}
		if (packageInfo.getSize().equalsIgnoreCase("LARGE")) {
			return new DeliveryByTruck().deliveryWay(packageInfo);
		}

		return "FAILED TO DELIVERY";
	}

}
