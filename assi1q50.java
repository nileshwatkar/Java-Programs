/*50. Write a program in C++ to enter length in centimeter and convert it into meter
and kilometer.
Sample Output:
Convert centimeter into meter and kilometer :
--------------------------------------------------
Input the distance in centimeter : 250000
The distance in meter is: 2500
The distance in kilometer is: 2.5 */

import java.util.*;

public class assi1q50
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
    double kilometer, meter,centimeter;

       System.out.println("Convert centimeter into meter and kilometer :");
      System.out.println("--------------------------------------------------");

            System.out.println("Input the distance in centimeter : ");
            centimeter=sc.nextDouble();

                meter = (centimeter/100);
                kilometer = (centimeter/100000);

                       System.out.println("The distance in meter is: " +meter);
                     System.out.println("The distance in kilometer is: " +kilometer);
		}
}



/*

F:\java>javac assi1q50.java

F:\java>java assi1q50
Convert centimeter into meter and kilometer :
--------------------------------------------------
Input the distance in centimeter :
250000
The distance in meter is: 2500.0
The distance in kilometer is: 2.5

F:\java>

F:\java>*/