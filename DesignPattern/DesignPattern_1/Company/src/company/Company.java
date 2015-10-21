package company;

import java.util.ArrayList;
import java.util.List;

import employee.IEngineer;

//singleton class which will have only single Instant 
public class Company {

	public static Company instant;

	private Company() {

	}

	// method to get first instant of the Company class
	public static Company getInstant() {
		if (instant == null) {
			return new Company();
		} else {
			return instant;
		}

	}

	public static List<IEngineer> engineerList = new ArrayList<IEngineer>();

	// method to add Engineer object in List
	public void addEngineer(IEngineer engineer) {

		engineerList.add(engineer);
	}

	// method to return list of Engineer
	public List<IEngineer> listOfEngineer() {

		return engineerList;
	}

}
