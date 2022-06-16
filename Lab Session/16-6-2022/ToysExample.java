package corejava;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ToysExample
{
//Creating multidimensional with string arrays
    String[][] toys = new String [5][5];
    
    //constructor 
    ToysExample()
    {

    toys [0][0]="1";
    toys[0][1]="Teddy bear";

    toys [1][0]="2";
    toys [1][1] ="Airplane";

    toys [2][0]="3";
    toys [2][1]="Car";

    toys [3][0]="4";
    toys [3][1]="Rocking horse";

    toys [4][0]="5";
    toys[4][1]="Train";

    }

    //static getToy method
    public static String getToy(int price)
    {
        String kidstoy;
        switch(price)
        
        //Price of each toy in case 
        {
  case 500: 
	  kidstoy = "Teddy bear";
      return kidstoy;
            
   case 400:
	   kidstoy = "Airplane";
       return kidstoy;
                
   case 300:
	   kidstoy = "Car";
        return kidstoy;
                
   case 700:
	   kidstoy = "Rocking horse";
        return kidstoy;
                
    case 450:
    	kidstoy = "Train";
         return kidstoy;
                
     default:
    	 kidstoy = "No Toys Available in this Range";
                return kidstoy;
        }
    }

       public static void main(String[] args) 
    {
    	 //Creating scanner class
        Scanner sc = new Scanner (System.in); 
        int price = sc.nextInt ();
        System.out.println(getToy(price));
        sc.close();
    }
} 
