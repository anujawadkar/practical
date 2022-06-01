package corejava;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferOutStream {

				public static void main(String args[]) throws Exception {

				FileOutputStream fout = new FileOutputStream("D:\\myFile.txt");
				
				//To read from the created file
				BufferedOutputStream bout = new BufferedOutputStream(fout);

				String s = "Welcome In World.";

				byte b[] = s.getBytes();

				bout.write(b);
				
                //
				bout.flush();

				bout.close();

				fout.close();

				System.out.println("success");
			}
		
	}


