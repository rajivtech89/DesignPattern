package com.rajiv.factory;

public class Main {

	public static void main(String[] args) {
		System.out.println("Delivery Mangaer process started");
		DeliveryManager deliveryManager = new DeliveryManager();

		PackageInfo packageInfoSmall = new PackageInfo("SMALL", "10");
		System.out.println(deliveryManager.delviveryManagerFactory(packageInfoSmall));

		PackageInfo packageInfoMedium = new PackageInfo("MEDIUM", "50");
		System.out.println(deliveryManager.delviveryManagerFactory(packageInfoMedium));

		PackageInfo packageInfoLarge = new PackageInfo("LARGE", "100");
		System.out.println(deliveryManager.delviveryManagerFactory(packageInfoLarge));

		PackageInfo packageInfoFailed = new PackageInfo("Double", "10");
		System.out.println(deliveryManager.delviveryManagerFactory(packageInfoFailed));
	}
}
