package com.oguzcan;

public class Traveler {

	private Vehicle v;

	public Traveler(Vehicle v) {
		this.v = v;
	}

	public void yolculugaBasla() {
		String yolculukAracý = v.aracVer("honda");
		System.out.println("yolculugunuz baslamak uzere");
		System.out.println(yolculukAracý + " ile yolculugunuz baslamýstýr.");
	}

}
