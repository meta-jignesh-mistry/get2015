package vehiclemanagement;

//exception class to handle exception generated during insertion into vehicle database

@SuppressWarnings("serial")
public class VehicleException extends Exception {
	
	public VehicleException ( String message ) {
		super ( message );
		System.out.println(message);
	}
}
