
package corejava;

import java.io.*;  

public class FilterOutStrm {  
	
    public static void main(String[] args) throws IOException {
    	
    	//Creating File object
        File data = new File("D:\\myFile.txt");  
        
        //To read from the created data
        FileOutputStream file = new FileOutputStream(data); 
        
        //To read from the created file
        FilterOutputStream filter = new FilterOutputStream(file);  
        
        String s="Welcome to Mumbai";    
        
        //Declare Byte Array
        byte b[]=s.getBytes(); 
        
        filter.write(b);     
        filter.flush();  
        filter.close();  
        file.close();  
        
        System.out.println("Success...");  
    }  
}
