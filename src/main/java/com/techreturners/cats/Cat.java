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

	public boolean isAsleep() {
		return isAsleep;
	}

	public void wakeUp() {
		isAsleep = false;
	}

	public void goToSleep() {
		isAsleep = true;
	}

	public abstract float getAverageHeight();

	public abstract String getSetting();
}

/* Domestic Cat */
class DomesticCat extends CatImp {
	private static final String noise = "Purrrrrrr";

	private float height;

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String eat() {
		return noise;
	}

	public String getSetting() {
		return "domestic";
	}

	public float getAverageHeight() {
		setHeight(23);
		return getHeight();
	}
}

/* LionCat Cat */
class LionCat extends CatImp {
	private static final String noise = "Roar!!!!";

	private float height;

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String eat() {
		return noise;
	}

	public String getSetting() {
		return "wild";
	}

	public float getAverageHeight() {
		setHeight(1100);
		return getHeight();
	}

}

/* Cheetah Cat */
class CheetahCat extends CatImp {
	private static final String noise = "Zzzzzzz";

	private float height;

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String eat() {
		return noise;
	}

	public String getSetting() {
		return "wild";
	}

	public float getAverageHeight() {
		setHeight(23);
		return getHeight();
	}

}