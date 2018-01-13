package com.example.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybatis.bean.Employee;
import com.example.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;

	public List<Employee> getAllEmps() {
		return employeeMapper.getAllEmps();
	}
}
