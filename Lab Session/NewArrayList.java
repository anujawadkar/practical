package corejava;
//Java program to create a new list,add some colour and print collection 
import java.util.*;
public class NewArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a, b, c, d;
		 // Creating A Scanner Class Object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		
		a = sc.next();
		b = sc.next();
		c = sc.next();
		d = sc.next();

		//Adding Object in arraylist From The User
			        ArrayList<String> color = new ArrayList<String>();
			        color.add(" "+ a);
			        color.add(" "+ b);
			        color.add(" "+ c);
			        color.add(" "+ d);
			        
			        System.out.print("Enter the color: "+color);
			    }  
			    			
	}


