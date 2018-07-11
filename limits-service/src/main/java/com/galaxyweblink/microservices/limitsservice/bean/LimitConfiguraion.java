package com.galaxyweblink.microservices.limitsservice.bean;

public class LimitConfiguraion {
int maximum;
int minimum;

public LimitConfiguraion(int max, int min){
	this.maximum=max;
	this.minimum=min;
}

protected LimitConfiguraion(){
	
}

public int getMaximum() {
	return maximum;
}

public void setMaximum(int maximum) {
	this.maximum = maximum;
}

public int getMinimum() {
	return minimum;
}

public void setMinimum(int minimum) {
	this.minimum = minimum;
}

}
