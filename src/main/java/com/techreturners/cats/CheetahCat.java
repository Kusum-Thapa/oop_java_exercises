package com.techreturners.cats;

class CheetahCat extends CatImp {
	private static final String noise = "Zzzzzzz";

	CheetahCat(){
		this.setAverageHeight(200f);
		this.setSetting("wild");
	}
	
	public String eat() {
		return noise;
	}
}

