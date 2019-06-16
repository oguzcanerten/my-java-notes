package com.oguzcan;

public class Car implements Vehicle {

	@Override
	public String aracVer(String marka) {
		System.out.println(marka + " marka bir araba aldýnýz.");
		return marka;
	}

}
