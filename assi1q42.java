/*42. Write a language program in C++ which accepts the user's first and last
name and print them in reverse order with a space between them.
Sample Output:
Print the name in reverse where last name comes first:
-----------------------------------------------------------
Input First Name: Alexandra
Input Last Name: Abramov
Name in reverse is: Abramov Alexandra*/


import java.util.*;

public class assi1q42
{
		public static void main(String[] args)
		{
				Scanner sc=new Scanner(System.in);
				char firstname=sc.nextChar();
				char lastname=sc.nextChar();
				
					
               System.out.println("Print the name in reverse where last name comes first:");
               System.out.println("-----------------------------------------------------------");

                System.out.println("Input First Name: ");
               

                System.out.println("Input Last Name: ");
                

                    System.out.println("Name in reverse is: "+lastname+" "+firstname);
		}
}