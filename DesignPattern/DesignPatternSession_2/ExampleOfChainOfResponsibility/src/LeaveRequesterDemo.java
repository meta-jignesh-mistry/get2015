import java.util.Scanner;

public class LeaveRequesterDemo {

	public static void main(String args[]) {

		System.out.println("\nEnter no. of leaves you required");
		Scanner sc = new Scanner(System.in);
		try {
			int day = sc.nextInt();
			if(day<=0){
				throw new Exception();
			}
			//setting the successor
			DoChaining chain = new DoChaining();
			//processing request for leave
			chain.doChaining().ProcessRequest(day);
		} catch (Exception e) {
			System.out.println("Invalid Input ");
			main(args);
		} finally {
			sc.close();
		}

	}

}
