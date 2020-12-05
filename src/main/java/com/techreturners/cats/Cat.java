package com.techreturners.cats;

interface Cat {

	public String eat();

	public boolean isAsleep();

	public void goToSleep();

	public String getSetting();

	public void wakeUp();

	public float getAverageHeight();

}

/* Abstract class for Cat */
abstract class CatImp implements Cat {

	boolean isAsleep = false;
	private float height;

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public boolean isAsleep() {
		return isAsleep;
	}

	public void wakeUp() {
		isAsleep = false;
	}

	public void goToSleep() {
		isAsleep = true;
	}

	public float getAverageHeight() {
		setHeight((float) 30.95);
		return getHeight();
	}

	public abstract String getSetting();

}

/* Domestic Cat */
class DomesticCat extends CatImp {
	private static final String noise = "Purrrrrrr";

	public String eat() {
		return noise;
	}

	public String getSetting() {
		return "domestic";
	}

	@Override
	public float getAverageHeight() {
		this.setHeight((float) 23);
		return this.getHeight();
	}
}

/* LionCat Cat */
class LionCat extends CatImp {
	private static final String noise = "Roar!!!!";

	public String eat() {
		return noise;
	}

	public String getSetting() {
		return "wild";
	}

	@Override
	public float getAverageHeight() {
		this.setHeight((float) 1100);
		return this.getHeight();
	}
}

/* Cheetah Cat */
class CheetahCat extends CatImp {
	private static final String noise = "Zzzzzzz";

	public String eat() {
		return noise;
	}

	public String getSetting() {
		return "wild";
	}
}