package com.techreturners.cats;

class LionCat extends CatImp {
	private static final String noise = "Roar!!!!";

	LionCat(){
		this.setAverageHeight(1100f);
		this.setSetting("wild");
	}

	public String eat() {
		return noise;
	}
}
