/*54. Write a program in C++ to enter P, T, R and calculate Simple Interest.
Sample Output:
Calculate the Simple Interest :
-----------------------------------
Input the Principle: 20000
Input the Rate of Interest: 10
Input the Time: 1.5
The Simple interest for the amount 20000 for 1 years @ 10 % is: 2000
*/


import java.util.*;

public class assi1q54
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
		double principleamount,rateofinterest,simpleinterest;
		double time;

           System.out.println("Calculate the Simple Interest :");
            System.out.println(" -----------------------------------");

                System.out.println("Input the Principle: ");
                principleamount=sc.nextDouble();

                 System.out.println("Input the Rate of Interest: ");
                rateofinterest=sc.nextDouble();

                System.out.println(" Input the Time: ");
                time=sc.nextDouble();

            simpleinterest=principleamount*rateofinterest*time/100;

 System.out.println("The Simple interest for the amount "+principleamount+" for "+time+" years @ "+rateofinterest+" % is: "+simpleinterest);

		}
}

/*

F:\java>javac assi1q54.java

F:\java>java assi1q54
Calculate the Simple Interest :
 -----------------------------------
Input the Principle:
20000
Input the Rate of Interest:
10
 Input the Time:
1.5
The Simple interest for the amount 20000 for 1.5 years @ 10 % is: 2000

F:\java>*/