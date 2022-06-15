package corejava;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.Writer;

public class OutputStrmWriter {  
    public static void main(String[] args) {  
        try {  
            OutputStream outputStream = new FileOutputStream("D:\\output.txt");  
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
  
            outputStreamWriter.write("Hello World");  
  
            outputStreamWriter.close(); 
            System.out.println("Success...");
        } catch (Exception e) {  
        	System.out.println("Sorry, Your Message Was Not Stored "+ e.getMessage());
        }  
    }  
}  
