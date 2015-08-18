import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//class to read the questions from the text file
public class ReadFromFile {
	static int count;
	
	public static String[] getQuestions() throws IOException{
	    String[] question=new String[3];
		try {
			StringTokenizer stringTokenizer=null;
			//file location as parameter
			FileInputStream fin = new FileInputStream(new File("C:\\Users\\Jignesh\\workspace\\OOP-2\\src\\surveyquestion.txt"));
			DataInputStream in = new DataInputStream(fin);
			 BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String fileData="";
			int i=0;
			
			while ((fileData = br.readLine()) != null) {
				
				stringTokenizer = new StringTokenizer(fileData,"\\n"); 
				
			         if(i==0){
			        	 question[0]=fileData;
			        	 
			         }
			         else if(i==1){
			        	 question[1]=fileData;
			         }
			         else if(i==2){
			        	 question[2]=fileData;
			         }
			         
			        	i++;  
			}
			
			
			fin.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return question;
	}
}
