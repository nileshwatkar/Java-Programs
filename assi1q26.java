/*26. Write a program in C++ to convert temperature in Fahrenheit to Kelvin.
Sample Output:
Convert temperature in Fahrenheit to Kelvin :
---------------------------------------------------
Input the temperature in Fahrenheit : 80.33
The temperature in Fahrenheit : 80.33
The temperature in Kelvin : 300*/


import java.util.*;

public class assi1q26
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);

			double fahrenheit,kelvin;

        System.out.println(" Convert temperature in Fahrenheit to Kelvin : ");
        System.out.println(" -----------------------------------------------------");

            System.out.println(" Input the temperature in Fahrenheit : ");
            fahrenheit=sc.nextDouble();

            kelvin=(5.0/9)*(fahrenheit-32)+273.15; //formula for the converting fahrenhiet into kelvin

                System.out.println("  The temperature in Fahrenheit : "+fahrenheit);
                System.out.println("  The temperature in Kelvin :"+kelvin);
		}
}
/*
F:\java>javac assi1q26.java

F:\java>java assi1q26
 Convert temperature in Fahrenheit to Kelvin :
 -----------------------------------------------------
 Input the temperature in Fahrenheit :
80.33
  The temperature in Fahrenheit : 80.33
  The temperature in Kelvin :300.0

F:\java>*/