package Train_Reservation_System;

/*
 * this class extends payment and store attributes for Net banking information 
 */
class NetBanking extends Payment{
	String userName;
	String bank;
	String password;
	public NetBanking(String pId,String pt,String bank,String uName,String pwd){
		this.paymentId=pId;
		this.paymentType=pt;
		this.bank=bank;
		this.userName=uName;
		this.password=pwd;
	}
}