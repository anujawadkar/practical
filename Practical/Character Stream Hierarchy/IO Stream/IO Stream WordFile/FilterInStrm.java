package corejava;

import java.io.*;  
public class FilterInStrm {  
    public static void main(String[] args) throws IOException {  
    	
    	//Creating File object
        File data = new File("D:\\myFile.txt");  
        
        //To read from the created data
        FileInputStream  file = new FileInputStream(data);  
        
        //To read from the created file
        FilterInputStream filter = new BufferedInputStream(file);  
        int k =0;  
        
      //Call Read() Method By Using While Loop
        while((k=filter.read())!=-1){  
        	
            System.out.print((char)k);  
        }  
        file.close();  
        filter.close();  
    }  
}  
