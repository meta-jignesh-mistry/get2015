
package Train_Reservation_System;

import java.io.IOException;
import java.util.ArrayList;

/*
 * this class stores the information about train.
 */
public abstract class Train {
		
		public String tType="";
		public String trainNumber="";
		public String timeDuration="";
		public int fare=0;
		public String fromToStation="";
		public int seats_weight=0;
	

		abstract ArrayList<Train> getPassengerTrainChart() throws NumberFormatException, IOException;
		abstract ArrayList<Train> getGoodsTrainChart() throws IOException;
}



