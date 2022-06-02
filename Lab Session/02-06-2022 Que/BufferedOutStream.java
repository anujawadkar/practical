package corejava;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutStream {

	//java program to demonstrate on Buffer
	
		
						public static void main(String args[]) throws Exception {

						FileOutputStream fout = new FileOutputStream("D:\\myFileNew.txt");
						
						//To read from the created file
						BufferedOutputStream bout = new BufferedOutputStream(fout);
						
		                    //with string Data Type
						String s = "Welcome In World.";

						byte b[] = s.getBytes();
						
		                //For write output
						bout.write(b);
						
		                //to Display immidiately
						bout.flush();

						bout.close();

						fout.close();

						System.out.println("success");
					}
				
			


	}


