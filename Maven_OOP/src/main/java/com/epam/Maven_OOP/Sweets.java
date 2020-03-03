package com.epam.Maven_OOP;

public class Sweets implements NewYearGift{
	private float pricePerKg;
	private int noOfKgs;
	private String sweetName;
	
	public Sweets(float pricePerKg, int noOfKgs, String sweetName) {
		super();
		this.pricePerKg = pricePerKg;
		this.noOfKgs = noOfKgs;
		this.sweetName = sweetName;
	}
	public float getPricePerKg() {
		return pricePerKg;
	}
	public void setPricePerKg(float pricePerKg) {
		this.pricePerKg = pricePerKg;
	}
	public int getNoOfKgs() {
		return noOfKgs;
	}
	public void setNoOfKgs(int noOfKgs) {
		this.noOfKgs = noOfKgs;
	}
	public String getSweetName() {
		return sweetName;
	}
	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}
	public float calculateWeight() {
		return noOfKgs * pricePerKg;
		
	}
	
}
