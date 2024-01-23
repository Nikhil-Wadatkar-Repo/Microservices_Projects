package com.sit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LimitController {
	@Autowired
	private Configurations config;
	@Autowired
	private RestTemplate rt;

	@GetMapping("/getLimits")
	public EmployeeDetails getLimits() {
		
//		http:localhost:9070/getEmpDetails
		EmployeeDetails details=(EmployeeDetails) rt.getForObject("http://localhost:9070/getEmpDetails", EmployeeDetails.class);
		
		return details;
	}
}
