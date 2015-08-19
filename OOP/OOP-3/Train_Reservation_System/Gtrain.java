package Train_Reservation_System;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * this class stores the information about Goods train.
 */
public class Gtrain extends Train{
	public Train tPassenger;
	public ArrayList<Train> gtrain = new ArrayList<Train>();
	
	public  Gtrain(String tt,String n,String t,int m,String fts,int w){
		this.tType=tt;
		this.trainNumber=n;
		this.timeDuration=t;
		this.fare=m;
		this.fromToStation=fts;
		this.seats_weight=w;
	}
	public Gtrain(){
		
	}
	ArrayList<Train> getPassengerTrainChart() throws NumberFormatException, IOException {
		return gtrain;
	}
	
	ArrayList<Train> getGoodsTrainChart() throws IOException{
		
		
		
		//this method read data from file
			
			try {
				StringTokenizer stringTokenizer;
				FileInputStream fin = new FileInputStream(new File("C:\\Users\\Jignesh\\workspace\\OOP3\\src\\Train_Reservation_System\\train"));
				DataInputStream in = new DataInputStream(fin);
				 BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String trainData="";
				int i=1;
				String trainType="",trainId="",time="",fare="",route="",capacity="";
				while ((trainData = br.readLine()) != null) {
					stringTokenizer = new StringTokenizer(trainData,","); 
					 i=1;
					 while (stringTokenizer.hasMoreTokens()) {  
				         if(i==1){  
				        	 trainType=stringTokenizer.nextToken();
				         }
				         else if(i==2){
				        	 trainId=stringTokenizer.nextToken();
				         }
				         else if(i==3){
				        	 time=stringTokenizer.nextToken();
				         }
				         else if(i==4){
				        	 fare=stringTokenizer.nextToken();
				         }
				         else if(i==5){
				        	 route=stringTokenizer.nextToken();
				         }else {
				        	 capacity=stringTokenizer.nextToken();
				         }
				        	i++; 
				     }
					int f=Integer.parseInt(fare);
					int c=Integer.parseInt(capacity);
					if(trainType.equalsIgnoreCase("g")){
						tPassenger=new Ptrain(trainType,trainId,time,f,route,c);
						gtrain.add(tPassenger);
					}
				}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return gtrain;
	}
}