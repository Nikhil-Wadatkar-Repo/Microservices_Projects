package com.nt;

public class EmployeeDetails {
	private Integer id;
	private String name;

	
	
	public EmployeeDetails(Integer id, String empName) {
		super();
		this.id = id;
		this.name = empName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", empName=" + name + "]";
	}

}
