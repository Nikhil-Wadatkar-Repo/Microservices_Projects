package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmpConfiguration configuration;

	@GetMapping("/getEmpDetails")
	public EmployeeDetails getEmployeeDetails() {
		return new EmployeeDetails(12, "NIC");
	}
}
