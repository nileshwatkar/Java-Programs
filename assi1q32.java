/*32. Write a program in C++ to check whether a number is positive, negative or
zero.
Sample Output:
Check whether a number is positive, negative or zero :
-----------------------------------------------------------
Input a number : 8
The entered number is positive.*/


import java.util.*;

public class assi1q32
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
				long number=0;

        System.out.println("Check whether a number is positive, negative or zero :");
        System.out.println("-----------------------------------------------------------");

            System.out.println("Input a number : ");
            number=sc.nextLong();

                if(number> 0)
                    {
                        System.out.println("The entered number is positive.");
                    }

                else if(number< 0)
                    {
                        System.out.println("The entered number is negative.");
                    }
                else
                    {
                        System.out.println("The number is zero.");
                    }
	}
}

/*F:\java>javac assi1q32.java

F:\java>java assi1q32
Check whether a number is positive, negative or zero :
-----------------------------------------------------------
Input a number :
8
The entered number is positive.

F:\java>java assi1q32
Check whether a number is positive, negative or zero :
-----------------------------------------------------------
Input a number :
-1
The entered number is negative.

F:\java>java assi1q32
Check whether a number is positive, negative or zero :
-----------------------------------------------------------
Input a number :
0
The number is zero.

F:\java>*/
