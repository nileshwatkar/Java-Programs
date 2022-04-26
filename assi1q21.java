/*21. Write a program in C++ to convert temperature in Fahrenheit to Celsius.
Sample Output:
Convert temperature in Fahrenheit to Celsius :
---------------------------------------------------
Input the temperature in Fahrenheit : 95
The temperature in Fahrenheit : 95
The temperature in Celsius : 35*/

import java.util.*;

public class assi1q21
{
		public static void main(String[] args)
		{
	
			Scanner sc=new Scanner(System.in);

			double fahernheit,celsius;

				System.out.println("Convert temperature in Celsius to Fahernheit:");
				System.out.println("-----------------------------------------------------");

					System.out.println("Input the temperature in Celsius:");
					fahernheit=sc.nextDouble();

					celsius=((fahernheit*5.0)-(5.0*32))/9;

						System.out.println("The Temperature in fahernheit:"+fahernheit);
						System.out.println("The temperature in Celsius:"+celsius);
		}

}
/*

F:\java>javac assi1q21.java

F:\java>java assi1q21
Convert temperature in Celsius to Fahernheit:
-----------------------------------------------------
Input the temperature in Celsius:
95
The Temperature in fahernheit:95.0
The temperature in Celsius:35.0

F:\java>


*/