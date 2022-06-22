package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCat {

	@Test
	
	public void Addtest() 
	{
		//creating a object of class
			MyJUnit junit=new MyJUnit(); 
	        String result=junit.ConCat("Java", " Queen");
	        assertEquals("Java Queen", result);		
		}
	

}
