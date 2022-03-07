
package ValidateEmail;

public class ValidateAnEmail 
{
	static boolean isValid(String email) {
	      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String email = "pratikshakheme@gmail.com";
	      System.out.println("The E-mail ID is: " + email);
	      System.out.println("Is the above E-mail ID valid? " + isValid(email));	
    }
}
