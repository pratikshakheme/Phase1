package Arithmetic_calc;
import java.util.Scanner;
public class Arithmetic_Calc {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub
				
				int a,b,ch;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter First Number:");
				a=sc.nextInt();
				
				System.out.println("Enter Second Number:");
				b=sc.nextInt();
				
				System.out.println("1->Add 2->Sub 3->Mul 4->Div Enter Your Choice");
				ch=sc.nextInt();
				
				if(ch==1)
				System.out.println("Addition="+(a+b));
				else if(ch==2)
				System.out.println("Subtraction="+(a-b));
				else if(ch==3)
				System.out.println("Multiply="+(a*b));
				else if(ch==4)
				System.out.println("Division="+(a/b));
				else
				System.out.println("Invalid choice");


	}

}
