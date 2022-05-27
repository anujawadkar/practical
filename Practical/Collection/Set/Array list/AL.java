package corejava;
import java.util.*; 
 class AL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist 
		//Creating arraylist  						
	                list.add("V");//Adding object in arraylist  
					list.add("jimin");  
					list.add("jungkook");  
					list.add("Suga");  
						
							//Traversing list through Iterator  
						Iterator itr=list.iterator();  
							while(itr.hasNext()){  
								System.out.println(itr.next());  
							}  
				}  
		
	}


