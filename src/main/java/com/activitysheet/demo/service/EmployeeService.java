package com.activitysheet.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activitysheet.demo.dao.EmployeeRepository;
import com.activitysheet.demo.entity.Employee;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		log.info(employee.toString());
		
		return employeeRepository.save(employee);
	}

	public Employee fetchEmployeeDetails(Long employeeId) {
		log.info("Fetching Employee Details  : from "+this.getClass().getName());
		return employeeRepository.findById(employeeId).get();
	}
}
