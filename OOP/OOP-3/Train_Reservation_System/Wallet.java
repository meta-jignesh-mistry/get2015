package Train_Reservation_System;

/*
 * this class extends payment and store attributes for wallet information 
 */
class Wallet extends Payment{
	
	public Wallet(String pId,String pt){
		this.paymentId=pId;
		this.paymentType=pt;
		
	}
}