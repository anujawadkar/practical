package corejava;
import java.io.FileInputStream;

public class ExceptionHandling {

	
	//program in a java using Exception Handling.
								public static void main(String args[]) {
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


