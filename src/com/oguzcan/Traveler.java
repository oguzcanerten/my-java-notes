package com.oguzcan;

public class Traveler {

	private Vehicle v;

	public Traveler(Vehicle v) {
		this.v = v;
	}

	public void yolculugaBasla() {
		String yolculukArac� = v.aracVer("honda");
		System.out.println("yolculugunuz baslamak uzere");
		System.out.println(yolculukArac� + " ile yolculugunuz baslam�st�r.");
	}

}
