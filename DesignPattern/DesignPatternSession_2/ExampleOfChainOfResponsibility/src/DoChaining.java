public class DoChaining {
	// method to set the successor
	public Approver doChaining()

	{
		Approver mentor = new Mentor();

		Approver srMentor = new SeniourMentor();

		mentor.SetSuccessor(srMentor);

		Approver hrManager = new HRManager();

		srMentor.SetSuccessor(hrManager);

		return mentor;
	}

}
