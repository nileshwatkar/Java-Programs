/*51. Write a program in C++ that converts kilometers per hour to miles per hour.
Sample Output:
Convert kilometers per hour to miles per hour :
----------------------------------------------------
Input the distance in kilometer : 5
The 5 Km./hr. means 3.10686 Miles/hr.*/



import java.util.*;

public class assi1q51
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
			double kilometerperhr, milesperhr;

            System.out.println("Convert kilometers per hour to miles per hour :");
            System.out.println("----------------------------------------------------");

                System.out.println(" Input the distance in kilometer : ");
                kilometerperhr=sc.nextDouble();

                    milesperhr = (kilometerperhr * 0.6213712);

                    System.out.println(" The " +kilometerperhr+" Km./hr. means "+milesperhr+" Miles/hr.");

		}
}

/*
F:\java>javac assi1q51.java

F:\java>java assi1q51
Convert kilometers per hour to miles per hour :
----------------------------------------------------
 Input the distance in kilometer :
5
 The 5.0 Km./hr. means 3.106856 Miles/hr.

F:\java>*/
