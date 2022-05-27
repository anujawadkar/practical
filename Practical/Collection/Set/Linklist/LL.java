package corejava;

import java.util.*;  
	public class LL{  
		public static void main(String args[]){  
			LinkedList<String> al=new LinkedList<String>();  
			al.add("V");  
			al.add("Jimin");  
			al.add("jungkook");  
			al.add("Suga");  
			
			Iterator<String> itr=al.iterator();  
				while(itr.hasNext()){  
					System.out.println(itr.next());  
				}  
		}  
	}  