
package ValidateEmail;

import java.util.*;
import java.util.regex.*;

public class EmailValidation1 
{
	 public static void main(String args[])
	 {  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("pratiksha@gmail.com");  
	        emails.add("pratiksha.kheme@gmail.com");  
	     
	        //Add invalid emails in list  
	        emails.add("@yahoo.com");  
	        emails.add("pratiksha#gmail.com");  
	      
	        //Regular Expression   
	        String regex = "^(.+)@(.+)$";  
	       
	        //Compile regular expression to get the pattern  
	        Pattern pattern = Pattern.compile(regex);  
	        //Iterate emails array list  
	        for(String email : emails)
	        {  
	            //Create instance of matcher   
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  

     }
}
