package com.techreturners.cats;

class DomesticCat extends CatImp {
	private static final String noise = "Purrrrrrr";

	DomesticCat(){
		this.setAverageHeight(23f);
		this.setSetting("domestic");
	}

	public String eat() {
		return noise;
	}
}