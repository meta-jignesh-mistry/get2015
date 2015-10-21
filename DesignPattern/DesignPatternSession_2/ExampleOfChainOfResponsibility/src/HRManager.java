public class HRManager extends Approver {

	@Override
	public void ProcessRequest(int day) {
		if (day<=5) {
			System.out.println("\nLeave Approved by HR Manager");
		} else {
			System.out.println("\nSorry ! HR Manager can not Approve now");
			System.out.println("\nMeeting  will be required !");
		}
	}

}
