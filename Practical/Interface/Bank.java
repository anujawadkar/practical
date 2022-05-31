package corejava;
//Java program to demonstrate working of

//A simple interface
public interface Bank {
	
	 // public, static and final
		float rateOfInterest();  
		
		}  
		//A class that implements the interface
	class SBI implements Bank{  
		
			public float rateOfInterest(){return 9.15f;}  
		
			}  
		
	class PNB implements Bank{  
		
			public float rateOfInterest(){return 9.7f;}  
		
	}  
		
	class TestInterface2{  
		 // Implementing the capabilities of
	    // interface.
		public static void main(String[] args){  
		
			Bank b=new SBI();  
		
			System.out.println("ROI: "+b.rateOfInterest());  
		
			}
		}  
		
	 

