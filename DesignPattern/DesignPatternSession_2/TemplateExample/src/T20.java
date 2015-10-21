public class T20 extends Cricket {
	// initialize the T-20 match
	@Override
	void initialize() {

		System.out.println("\nT-20 match Initialized...Ready to play!");
	}

	// Start T-20 match
	@Override
	void startPlay() {

		System.out.println("T-20 match Started..Enjoy!");
	}

	// End T-20 Match
	@Override
	void endPlay() {

		System.out.println("T-20 Match Ended ");
	}
}
