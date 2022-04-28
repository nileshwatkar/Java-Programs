/*55. Write a program in C++ to enter P, T, R and calculate Compound Interest.
Sample Output:
Calculate the Compound Interest :
------------------------------------- Input the Principle: 20000
Input the Rate of Interest: 10
Input the Time: 1.5
The Interest after compounded for the amount 20000 for 1.5 years @ 10
% is: 3073.8 The total amount after compounded for the amount 20000 for 1.5
years @
10 % is: 23073.8*/



import java.util.*;

public class assi1q55
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
		double principleamount,rateofinterest,time,compundedamount,compoundedinterest;

		 System.out.println("Calculate the Compound Interest :");
		 System.out.println("------------------------------------");

            System.out.println("Input the Principle: ");
            principleamount=sc.nextDouble();
	
             System.out.println(" Input the Rate of Interest: ");
            rateofinterest=sc.nextDouble();

            System.out.println(" Input the Time: ");
            time=sc.nextDouble();

                compundedamount=principleamount*Math.pow((1+rateofinterest/100),time)-principleamount;
                compoundedinterest=principleamount*Math.pow((1+rateofinterest/100),time);

 System.out.println(" The Interest after compounded for the amount "+principleamount+" for "+time+" years @ "+rateofinterest+" % is: "+compoundedinterest);

 System.out.println(" The total amount after compounded for the amount "+principleamount+" for "+time+" years @ "+rateofinterest+" % is: "+compundedamount);
		}

}

/*
F:\java>javac assi1q55.java

F:\java>java assi1q55
Calculate the Compound Interest :
------------------------------------
Input the Principle:
20000
 Input the Rate of Interest:
10
 Input the Time:
1.5
 The Interest after compounded for the amount 20000.0 for 1.5 years @ 10.0 % is: 23073.79465974334
 The total amount after compounded for the amount 20000.0 for 1.5 years @ 10.0 % is: 3073.79465974334

F:\java>*/