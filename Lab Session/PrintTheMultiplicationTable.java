package corejava;
//Write a program that prompts the user to input a positive integer.It should then print the multiplication table of the number.
import java.util.*;
public class PrintTheMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
						  Scanner s = new Scanner(System.in);
					System.out.print("Enter number:");
					// number n for which we have to print Multiplication table
					int n=s.nextInt();
					
					// looping from 1 to 10 to print the multiplication table of number
					// using for loop
					for(int i=1; i <= 10; i++)
				        {
					//print the N*i ie it multipule of N	
				            System.out.println(n+" * "+i+" = "+n*i);
				        }
				    }
				
	}


