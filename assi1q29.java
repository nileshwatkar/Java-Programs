/*29. Write a program in C++ to compute quotient and remainder.
Sample Output:
Compute quotient and remainder :
-------------------------------------
Input the dividend : 25
Input the divisor : 3
The quotient of the division is : 8
The remainder of the division is : 1*/


import java.util.*;

public class assi1q29
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
				int quotient, divisor, dividend,remainder;

            System.out.println(" Compute quotient and remainder");
            System.out.println(" -------------------------------------");


                System.out.println(" Input the dividend : ");
                dividend=sc.nextInt();

                System.out.println(" Input the divisor : ");
                divisor=sc.nextInt();

                    quotient=dividend / divisor;
                    remainder=dividend % divisor;

                        System.out.println(" The quotient of the division is : "+quotient);
                        System.out.println(" The remainder of the division is : "+remainder);

       }
}
/*F:\java>javac assi1q29.java

F:\java>java assi1q29
 Compute quotient and remainder
 -------------------------------------
 Input the dividend :
25
 Input the divisor :
3
 The quotient of the division is : 8
 The remainder of the division is : 1

F:\java>



*/