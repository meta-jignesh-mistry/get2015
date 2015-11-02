package com.employee.facade;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.employee.db.EmployeeDao;
import com.employee.exception.EmployeeSystemException;
import com.employee.model.Employee;

public class EmployeeFacade {

	//create method
	public void create(String name, String email, Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.create(name, email, connection);
	}

	//retrieve employee by Id
	public Employee retrieveById(int id, Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		Employee employee = employeeDao.retrieveById(id, connection);
		return employee;
	}

	//retrieve employee by name
	public List<Employee> retrieveAllByName(String name, Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		List<Employee> employees = employeeDao.retrieveAllByName(name,
				connection);
		return employees;
	}

	//retrieve all employee
	public List<Employee> retrieveAll(Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		List<Employee> employees = employeeDao.retrieveAll(connection);
		return employees;
	}

	//delete employee by id
	public void deleteById(int id, Connection connection)
			throws EmployeeSystemException, SQLException {
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.deleteById(id, connection);
	}
}
