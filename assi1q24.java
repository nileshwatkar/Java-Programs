/*24. Write a program in C++ to convert temperature in Kelvin to Fahrenheit.
Sample Output:
Convert temperature in Kelvin to Fahrenheit :
---------------------------------------------------
Input the temperature in Kelvin : 300
The temperature in Kelvin : 300
The temperature in Fahrenheit : 80.33*/


import java.util.*;

public class assi1q24
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
   
			double kelvin,fahrenheit;

         System.out.println(" Convert temperature in Kelvin to Fahrenheit ");
         System.out.println("--------------------------------------------------");

             System.out.println("Input the temperature in Kelvin : ");
			kelvin=sc.nextDouble();

            fahrenheit=(9.0/5)*(kelvin-273.15)+32;

                 System.out.println("The temperature in Kelvin :"+kelvin);
                 System.out.println("The temperature in Fahrenheit :"+fahrenheit);

		}

}
/*
F:\java>javac assi1q24.java

F:\java>java assi1q24
 Convert temperature in Kelvin to Fahrenheit
--------------------------------------------------
Input the temperature in Kelvin :
300
The temperature in Kelvin :300.0
The temperature in Fahrenheit :80.33000000000004

F:\java>*/