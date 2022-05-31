package corejava;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	    //creating filereader object
		        FileReader file = new FileReader("D:/myFile.txt");
		        BufferedReader br = new BufferedReader(file);
		        
		        //To read from the creating file
		        int i ;
		        //Calling read() method using While loop
		        while((i=br.read())!= -1){
		            System.out.print((char)i);        }
		    
		        //Calling close() method
		        br.close();
		        file.close();
		    }
			    
		}
