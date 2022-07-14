package com.activitysheet.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.ToString.Include;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name ="ASM_EMPLOYEE")
public class Employee {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="AE_ID")
	private Long id;
	
	@Column(name = "AE_NAME")
	private String name;
	
	@Column(name = "AE_TASK_NAME")
	private String taskName;
	
	@Column(name = "AE_TASK_ID")
	private String taskId;
	
	@Column(name = "AE_MANAGER_ID")
	private Long managerId;
	
	@Column(name = "AE_HOURS")
	private Double hours;
	
	

}
