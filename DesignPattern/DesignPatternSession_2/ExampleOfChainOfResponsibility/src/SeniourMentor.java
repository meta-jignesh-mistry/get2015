public class SeniourMentor extends Approver {

	@Override
	public void ProcessRequest(int day) {
		if (day == 2) {
			System.out.println("Leave Approved by Seniour mentor");
		} else {
			System.out.println("\nSorry ! Seniour Mentor can not Approve");

			successor.ProcessRequest(day);
		}
	}

}
