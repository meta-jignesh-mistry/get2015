
package com.helper;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.models.Employee;

public class EmployeeInitialization implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub

	}

	/**
	 * @name contextInitialized()
	 * @description this function will call on application start up and
	 *              initialize the employee cache with 5 employees details
	 * @param event
	 *            (ServletContextEvent event)
	 * @return
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		
		Map<Integer, Employee> employeeCache = new ConcurrentHashMap<Integer, Employee>();
		ServletContext context = event.getServletContext();
		int id = 0;
		//Date date = new Date();
		id++;
		employeeCache.put(id, new Employee("jignesh", "jmistry94@gmail.com", 22, id,
				"2015-05-12"));
		id++;
		employeeCache.put(id, new Employee("rahul", "rahul@gmail.com", 23, id,
				"2015-11-12"));
		id++;
		employeeCache.put(id, new Employee("dinesh", "dinesh@gmail.com", 24, id,
				"2015-10-17"));
		id++;
		employeeCache.put(id, new Employee("Ranchhod", "rc@gmail.com", 22,
				id, "2014-06-11"));
		id++;
		employeeCache.put(id, new Employee("Ashwin", "ashwin@gmail.com", 22,
				id, "2015-11-22"));

		context.setAttribute("employeeCache", employeeCache);
		EmployeeMain.employeesCache = employeeCache;
	}
}
