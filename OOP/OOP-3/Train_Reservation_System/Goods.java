package Train_Reservation_System;


/*
 * this class stores the information about Goods booking history.
 */
public class Goods {
	
	String userName="";
	String trainNumber="";
	String ticketId="";
	String paymentId="";
	int nWeight=0;
	int totalAmount=0;
	public Goods(String userName,String trainNumber,String ticketId,String paymentId,int nWeight,int totalAmount){
		this.userName=userName;
		this.trainNumber=trainNumber;
		this.nWeight=nWeight;
		this.totalAmount=totalAmount;
		this.ticketId=ticketId;
		this.paymentId=paymentId;
	}
}

