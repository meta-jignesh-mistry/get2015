public class Mentor extends Approver {

	@Override
	public void ProcessRequest(int day) {
		if (day == 1) {
			System.out.println("\nLeave Approved by Mentor");
		} else {
			System.out.println("\nSorry !Mentor can not Approve");

			successor.ProcessRequest(day);

		}
	}
}
