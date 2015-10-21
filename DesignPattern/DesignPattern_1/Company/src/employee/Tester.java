package employee;
//Tester Class
public class Tester implements IEngineer {
	private String name;
	private String role;

	public String toString() {
		return "Name= " + name + " , Role= " + role;
	}

	@Override
	public void createEngineer(String name, String role) {
		// TODO Auto-generated method stub
		this.name = name;
		this.role = role;

	}
}
