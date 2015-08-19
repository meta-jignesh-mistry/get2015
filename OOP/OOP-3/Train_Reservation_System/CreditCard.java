package Train_Reservation_System;

/*
 * this class extends payment and store attributes for credit card information 
 */
public class CreditCard extends Payment{
	String cardNumber;
	String cvvNumber;
	public CreditCard(String pId,String pt,String ccNumber,String cvv){
		this.paymentId=pId;
		this.paymentType=pt;
		this.cardNumber=ccNumber;
		this.cvvNumber=cvv;
	}
}


