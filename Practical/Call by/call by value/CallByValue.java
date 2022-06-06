// Java Program Showcasing Uses Of Call By Value In Examples 
package corejava;

//Importing java input output classes 
import java.io.*;

//Class 
public class CallByValue {


	// Class 
	
		// swap method
		static void swap(int a, int b) {
			int temp = a;
			a = b;
			b = temp;
			System.out.println("Values after swapping x=" + a + " y=" + b);
		}

		public static void main(String[] args) {
			int x = 5;
			int y = 7;
			System.out.println("Values before swapping x=" + x + " y=" + y);
			// calling swap mehod
			swap(x, y);
		}
	}