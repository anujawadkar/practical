package corejava;
import java.io.BufferedReader;
import java.io.FileReader;
public class BufferReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		        FileReader file = new FileReader("D:/myFile.txt");
		        BufferedReader br = new BufferedReader(file);
		        int i ;
		        while((i=br.read())!= -1){
		            System.out.print((char)i);        }
		    
		        br.close();
		        file.close();
		    }
		    
		}
