/*27. Write a program in C++ to convert temperature in Celsius to Kelvin.
Sample Output:
Convert temperature in Celsius to Kelvin :
---------------------------------------------------
Input the temperature in Celsius : 26.85
The temperature in Celsius : 26.85
The temperature in Kelvin : 300*/





import java.util.*;

public class assi1q27
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);

				double kelvin, celsius;

		System.out.println("Convert temperature in Celsius to Kelvin");
		System.out.println(" ---------------------------------------------------");

           System.out.println(" Input the temperature in Celsius : ");
           celsius=sc.nextDouble();

            kelvin = celsius + 273.15;

                System.out.println("The temperature in Celsius : "+celsius);
                System.out.println("The temperature in Kelvin : "+kelvin);

	}	
}
/*
F:\java>javac assi1q27.java

F:\java>java assi1q27
Convert temperature in Celsius to Kelvin
 ---------------------------------------------------
 Input the temperature in Celsius :
26.85
The temperature in Celsius : 26.85
The temperature in Kelvin : 300.0

F:\java>*/