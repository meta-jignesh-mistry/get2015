package employee;

import employee.Developer;
import employee.Tester;
import employeeEnum.EmployeeType;

//factory class to get object of the Engineer Type object 
public class EngineerFactory {

	public IEngineer getEngineer(EmployeeType empType) {

		if (empType.equals(EmployeeType.devloper)) {
			return new Developer();
		} else if (empType.equals(EmployeeType.tester)) {
			return new Tester();
		} else {
			return null;
		}

	}

}
