package corejava;
import java.io.FileOutputStream;
public class FileOutSrea {
	//java program to demonstrate on FileOutputStreams
			public static void main(String args[]) {
				try {
					 //creating file InputStream Object
					FileOutputStream fout = new FileOutputStream("D:\\myFileNew.txt");
					
					// With Integer data type
					fout.write(65);

					// With String data type
					
					fout.close();
					System.out.println("success...");
				} 
				catch (Exception e) {
					System.out.println(e);
				}
			}
			}


	
		
					
		
	


