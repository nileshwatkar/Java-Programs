/*49. Write a program in C++ to print the code (ASCII code / Unicode code etc.) of
a given character.
Sample Output:
Print code (ASCII code / Unicode code etc.) of a given character:
-----------------------------------------------------------------------
Input a character: a
The ASCII value of a is: 97
The character for the ASCII value 97 is: a*/



import java.util.*;

public class assi1q49
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
   
	System.out.println(" Print code (ASCII code / Unicode code etc.) of a  given character:");
	System.out.println("-----------------------------------------------------------------------");
 	System.out.println(" Input a character: ");
	   char ascii=sc.next().CharAt(0);
		
		System.out.println("The ASCII value of "+ascii+" is: " +(int)ascii);
		System.out.println("The character for the ASCII value "+(int)ascii +" is: "+(char)((int)ascii));
		}
		
}


