package com.example.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import com.example.mybatis.bean.Employee;

public interface EmployeeMapper {

	public List<Employee> getAllEmps();

	public Employee getEmpById(Integer id);

	public void addEmp(Employee employee);

	public void updateEmp(Employee employee);

	public Long deleteEmp(Integer id);
}
