package corejava;
import java.io.*; 
public class OutputExample {

	public static void main(String[] args) throws IOException {  
		
		       //create file input output stream object
		        FileOutputStream file = new FileOutputStream("D:\\myFile.txt");  
		        DataOutputStream data = new DataOutputStream(file);  
		        data.writeInt(65);  
		        
		        //for Display immidiately
		        data.flush();  
		        data.close();  
		        System.out.println("Succcess...");  
		    }  
		

	}


