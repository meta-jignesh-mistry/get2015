
package Train_Reservation_System;

/*
 * this class stores the information about Passenger booking history.
 */
public class Passenger {
	
	String userName="";
	String trainNumber="";
	String ticketId="";
	String paymentId="";
	int nSeat=0;
	int totalAmount=0;
	public Passenger(String userName,String trainNumber,String ticketId,String paymentId,int nSeat,int totalAmount){
		this.userName=userName;
		this.trainNumber=trainNumber;
		this.nSeat=nSeat;
		this.totalAmount=totalAmount;
		this.ticketId=ticketId;
		this.paymentId=paymentId;
	}
}

