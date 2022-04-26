/*25. Write a program in C++ to convert temperature in Kelvin to Celsius.
Sample Output:
Convert temperature in Kelvin to Celsius :
------------------------------------------------
Input the temperature in Kelvin : 300
The temperature in Kelvin : 300
The temperature in Celsius : 26.85*/


import java.util.*;

public class assi1q25
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);

			double kelvin,celsius;

        System.out.println(" Convert temperature in Kelvin to Celsius:");
        System.out.println("-----------------------------------------------------");

            System.out.println(" Input the temperature in Kelvin :");
            kelvin=sc.nextDouble();//input for kelvin

            celsius=kelvin-273.15;//formula for converting kelvin to celsius

                System.out.println("The Temperature in Kelvin:"+kelvin);
                System.out.println("The temperature in Celsius:"+celsius);

	}

}
/*
F:\java>javac assi1q25.java

F:\java>java assi1q25
 Convert temperature in Kelvin to Celsius:
-----------------------------------------------------
 Input the temperature in Kelvin :
300
The Temperature in Kelvin:300.0
The temperature in Celsius:26.850000000000023

F:\java>*/