package companyDemo;
import java.util.Scanner;

import company.Company;
import employee.EngineerFactory;
import employee.IEngineer;
import employeeEnum.EmployeeType;

public class CompanyDemo {

	public static void main(String args[]) {

		EngineerFactory engFactory = new employee.EngineerFactory();
		Company company = Company.getInstant();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\npress 1 to add Engineer to Company");
			System.out.println("press 2 to show list of Engineer in Company");
			System.out.println("press 3 to Exit");

			String choice = sc.next();

			switch (choice) {
			case "1":

				System.out.println("\nPress d to add Developer");
				System.out.println("Press t to add Tester");
				String etype = sc.next();
				switch (etype) {
				case "d":
					//getting the devloper type object from Employee Factory Class
					IEngineer developer = engFactory
							.getEngineer(EmployeeType.devloper);
					System.out.println("Enter name");
					sc.nextLine();
					developer.createEngineer(sc.nextLine(),
							EmployeeType.devloper.toString());
					//adding the developer object into the list
					company.addEngineer(developer);
					break;

				case "t":

					//getting the tester type object from Employee Factory Class
					IEngineer tester = engFactory
							.getEngineer(EmployeeType.tester);
					System.out.println("Enter name");
					sc.nextLine();
					tester.createEngineer(sc.nextLine(),
							EmployeeType.tester.toString());
					//adding the tester object into the list
					company.addEngineer(tester);
					break;
				
				default:
					System.out.println("Invalid  input");
				}
				break;
			case "2":
				System.out.println("\n");
				System.out.println("--List of Engineer in Company--\n");
				//printing the Enginners list
				for (IEngineer e : Company.engineerList) {
					System.out.println(e);

				}
				System.out.println("\n");
				break;
			case "3":
				return;
			default:
				System.out.println("Invalid Input");
			}
		}

	}

}
