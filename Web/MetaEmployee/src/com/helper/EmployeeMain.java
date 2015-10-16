
package com.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.models.Employee;

public class EmployeeMain {
	public static Map<Integer, Employee> employeesCache = new ConcurrentHashMap<Integer, Employee>();

	/**
	 * @name getAllEmployees()
	 * @description it will return the employee cache of all registered
	 *              employees
	 * @param
	 * @return employeesCache(cache of all registered employees)
	 */
	public static Map<Integer, Employee> getAllEmployees() {
		return employeesCache;
	}

}
