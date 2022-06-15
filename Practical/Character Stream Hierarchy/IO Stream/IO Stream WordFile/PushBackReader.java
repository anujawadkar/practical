package corejava;

import java.io.*;  
public class PushBackReader{  
	
    public static void main(String[] args) throws Exception {  
    	
        char ary[] = {'1','5','-','-','-','1','2','-','-','-','2','0','0','0'}; 
        
        CharArrayReader reader = new CharArrayReader(ary);   
        
        PushbackReader push = new PushbackReader(reader);  
        
        int i;  
            while( (i = push.read())!= -1) {  
                if(i == '-') {  
                    int j;  
                    if( (j = push.read()) == '-'){  
                         System.out.print("#*");  
                    }
                    else {  
                    	// push back single character  
                        push.unread(j); 
                        System.out.print((char)i);  
                    }  
                }
                else {  
                        System.out.print((char)i);  
                }  
           }         
    }  
}  
