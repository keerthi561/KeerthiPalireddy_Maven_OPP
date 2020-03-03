package com.epam.Maven_OOP;

public class Chocolate implements NewYearGift{
	private float price;
	private int noOfPieces;
	private String chocolateName;
	
	public Chocolate(float price, int noOfPieces, String chocolateName) {
		super();
		this.price = price;
		this.noOfPieces = noOfPieces;
		this.chocolateName = chocolateName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getNoOfPieces() {
		return noOfPieces;
	}

	public void setNoOfPieces(int noOfPieces) {
		this.noOfPieces = noOfPieces;
	}

	public String getChocolateName() {
		return chocolateName;
	}

	public void setChocolateName(String chocolateName) {
		this.chocolateName = chocolateName;
	}

	public float calculateWeight() {
		return noOfPieces * price;
		
	}
}
