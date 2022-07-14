package com.activitysheet.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activitysheet.demo.entity.Employee;
import com.activitysheet.demo.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/employees")
@Slf4j
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		log.info("Inside "+this.getClass().getName() );
		Employee savedEmployees = employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(savedEmployees, HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeDetail(@PathVariable("id") Long employeeId){
		log.info("Inside "+ this.getClass().getName() +" in method : getEmployeeDetails");
		Optional.ofNullable(employeeId).orElseThrow();
		Employee employeeDetail = employeeService.fetchEmployeeDetails(employeeId);
		return new ResponseEntity<Employee>(employeeDetail,HttpStatus.OK);
	}
}
