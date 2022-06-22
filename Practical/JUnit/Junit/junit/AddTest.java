package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void Addtest() 
	{
		//creating a object of class
		MyJUnit junit=new MyJUnit(); 
        int result=junit.add(10, 26);
        assertEquals(36, result);		
	}

}
