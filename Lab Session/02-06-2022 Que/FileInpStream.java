package corejava;
import java.io.FileInputStream;
//java program to demonstrate on fileInputstream
public class FileInpStream {

	
					public static void main(String args[]) {
						//Statement cause an exception
				try
				{
					 //creating file InputStream Object
					FileInputStream fin = new FileInputStream("D:\\myFileNew.txt");
					int i = 0;
					
					//calling a read() method by using while loop
					while ((i = fin.read()) != -1) {
						System.out.print((char) i);
					}
					fin.close();
				} 
				//Error handling code
				catch (Exception e) {
					System.out.println(e);
				}
			
				}
			}
	

			



						
					

	

