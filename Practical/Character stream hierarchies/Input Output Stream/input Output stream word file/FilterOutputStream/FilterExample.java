package corejava;
import java.io.*; 
public class FilterExample {
		 
		    public static void main(String[] args) throws IOException {  
		        File data = new File("D:\\testout.txt");  
		        FileOutputStream file = new FileOutputStream(data);  
		        FilterOutputStream filter = new FilterOutputStream(file);  
		        String s="Welcome to Mumbai.";      
		        byte b[]=s.getBytes();      
		        filter.write(b);
		        
		        
		        //for Display immidiately
		        filter.flush();  
		        filter.close();  
		        file.close();  
		        System.out.println("Success...");  
		    }  
		
	}


