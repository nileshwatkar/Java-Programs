/*20. Write a program in C++ to convert temperature in Celsius to Fahrenheit.
Sample Output:
Convert temperature in Celsius to Fahrenheit :
---------------------------------------------------
Input the temperature in Celsius : 35
The temperature in Celsius : 35
The temperature in Fahrenheit : 95*/


import java.util.*;

public class assi1q20
{
		public static void main(String[] args)
		{
	
			Scanner sc=new Scanner(System.in);
		

    double fahernheit,celsius;

        System.out.println("Convert temperature in Celsius to Fahernheit:");
        System.out.println("-----------------------------------------------------");

            System.out.println("Input the temperature in Celsius:");
            celsius=sc.nextDouble();

            fahernheit=(celsius*9.0)/5.0+32;

                System.out.println("The Temperature in Celsius:"+celsius);
                System.out.println("The temperature in Fahernheit:"+fahernheit);
		}
}

/*

F:\java>javac assi1q20.java

F:\java>java assi1q20
Convert temperature in Celsius to Fahernheit:
-----------------------------------------------------
Input the temperature in Celsius:
35
The Temperature in Celsius:35.0
The temperature in Fahernheit:95.0
*/