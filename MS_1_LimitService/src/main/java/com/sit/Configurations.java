package com.sit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@ConfigurationProperties("limits-service")
public class Configurations {
	private Integer min;
	private Integer max;
	
	



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

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
