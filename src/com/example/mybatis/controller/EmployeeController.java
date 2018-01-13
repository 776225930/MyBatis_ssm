package com.example.mybatis.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.mybatis.service.EmployeeService;

@Controller
public class EmployeeController {
    @Autowired
	private EmployeeService employeeService;
    @RequestMapping("/emps")
	public String listAllEmps(Map<String,Object> map){
        map.put("emps", employeeService.getAllEmps());
		return "list";
	} 
}
