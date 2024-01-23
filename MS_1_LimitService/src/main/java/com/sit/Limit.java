package com.sit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
//@ConfigurationProperties("limit-service")
public class Limit {
	private Integer min;
	private Integer max;
	
	

	public Limit(Integer min, Integer max) {
		super();
		this.min = min;
		this.max = max;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "Limit [min=" + min + ", max=" + max + "]";
	}

}
