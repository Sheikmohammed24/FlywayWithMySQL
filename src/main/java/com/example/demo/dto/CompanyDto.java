package com.example.demo.dto;

import lombok.Data;

@Data
public class CompanyDto {
	
	private int id;
	private String company_name;
	private String location;
	private int no_of_emp;
	private int projects;
}
