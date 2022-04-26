/*23. Write a program in C++ that converts kilometers per hour to miles per hour.
Sample Output:
Convert kilometers per hour to miles per hour :
----------------------------------------------------
Input the distance in kilometer : 25
The 25 Km./hr. means 15.5343 Miles/hr*/


import java.util.*;

public class assi1q23
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
				double miles,kilometer;

        System.out.println("Convert kilometers per hour to miles per hour");
        System.out.println("---------------------------------------------------------");

            System.out.println("Input the distance in kilometer : ");
            
			kilometer=sc.nextDouble();   //input for kilometer

            miles=(kilometer*0.6213712);  //kilometer per hour and 1 km is 0.6213712 miles so we multiplies kilometer with 0.6213712

                System.out.println("The "+kilometer+"Km/hr"+" means "+miles+" miles/hr");

		}
}
/*
F:\java>javac assi1q23.java

F:\java>java assi1q23
Convert kilometers per hour to miles per hour
---------------------------------------------------------
Input the distance in kilometer :
25
The 25.0Km/hr means 15.53428 miles/hr

F:\java>
*/