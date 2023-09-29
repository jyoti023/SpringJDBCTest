package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entity.Employee;

public class MyClassDoaImpl implements MyClassDao {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Employee employee) {
		String query ="insert into employee(id,name) values(?,?)";
	int result=	this.jdbcTemplate.update(query, employee.getId(), employee.getName());
		return result;
	}

}
