package corejava;

public class CallByReferance {
 /*
	     *  The original value of 'a' will be changed as we are trying
	     *  to pass the objects. Objects are passed by reference.
	     */
	    
	    int a = 10;
	    int b = 20;
	    void call( CallByReferance c) {
	        c.a = c.a+10;
	        c.b = c.b+20;
	    }
	    
	    public static void main(String[] args) {

	    	CallByReferance c = new CallByReferance();
	        System.out.println("Before call-by-reference: " + c.a);
	        System.out.println("before call-by-reference: " +c.b);
	        // passing the object as a value using pass-by-reference
	        c.call(c);
	        System.out.println("After call-by-reference: " + c.a);
	        System.out.println("After call-by-reference:" + c.b);
	        
	    }

		}


	