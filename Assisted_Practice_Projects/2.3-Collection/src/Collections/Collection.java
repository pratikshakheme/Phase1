package Collections;

import java.util.*;
public class Collection 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> Name=new ArrayList<String>();   
	      Name.add("Pratiksha");//
	      Name.add("Pooja");    	   
	      System.out.println(Name);  
	      
	    //creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(5); 
	      vec.addElement(10); 
	      System.out.println(vec);

	    //creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String>  Chocolate=new LinkedList<String>();  
	      Chocolate.add("Dairy-Milk");  
	      Chocolate.add("Kitkat");  	      
	      Iterator<String> itr=Chocolate.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);

	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	}

	}
}
