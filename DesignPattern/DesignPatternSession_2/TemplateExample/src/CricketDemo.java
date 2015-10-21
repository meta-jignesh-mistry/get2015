import java.util.Scanner;

public class CricketDemo {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Cricket cricket = null;

		while (true) {
			System.out
					.println("\n Press 1 to play Test Match \n Press 2 to play T-50 format \n Press 3 to play T-20 format \n Press 4 to exit");
			String choice = sc.next();
			switch (choice) {
			case "1":
				//instant of test match class
				cricket = new TestMatch();
				cricket.play();
				break;
			case "2":
				//instant of T-50 class
				cricket = new T50();
				cricket.play();
				break;
			case "3":
				//instant of T-20 class
				cricket = new T20();
				cricket.play();
				break;
			case "4": return;
			default:
				System.out.println("Invalid Input");
			}

		}
	}
}
