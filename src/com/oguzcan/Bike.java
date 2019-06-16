package com.oguzcan;

public class Bike implements Vehicle {

	@Override
	public String aracVer(String marka) {
		System.out.println(marka + " marka bir bisiklet aldýnýz.");
		return marka;
	}
}
