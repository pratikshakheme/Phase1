
package InnerClasses;

//anonymous inner class
abstract class AnonymousInnerClass
{
	   public abstract void display();
}

public class innerClassAssisted3
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AnonymousInnerClass i = new AnonymousInnerClass()
		{

	         public void display()
	         {
	            System.out.println("Anonymous Inner Class");
	         }
	     };
	   i.display();
	}

}
