package employee;

import java.util.Comparator;


public class NameComparator implements Comparator {
	//comparision of Employee Object based on Employee name
	@Override
	public int compare(Object arg1, Object arg2) {
		Employee emp1 = (Employee) arg1;
		Employee emp2 = (Employee) arg2;
		return emp1.getName().compareToIgnoreCase(emp2.getName());
	}

	
		
}
