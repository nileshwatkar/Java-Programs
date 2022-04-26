/*19 Write a program in C++ to find the area and circumference of a circle.
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159*/


import java.util.*;

public class assi1q19
{
		public static void main(String[] args)
		{
	
			Scanner sc=new Scanner(System.in);
		
		
			double area,radius,circumference;

        System.out.println("Find the area and circumference of any circle:");
        System.out.println("\n\n\n-----------------------------------------------------");

            System.out.println("Input the radius(1/2 of diameter) of a circle:");
            radius=sc.nextDouble();

            circumference=2*3.14*radius;
            area=3.14*(radius*radius);

               System.out.println("The area of the circle is: "+area);
                System.out.println("The circumference of the circle is: "+circumference);

		}
}
/*
F:\java>javac assi1q19.java

F:\java>java assi1q19
Find the area and circumference of any circle:



-----------------------------------------------------
Input the radius(1/2 of diameter) of a circle:
5
The area of the circle is: 78.5
The circumference of the circle is: 31.400000000000002

F:\java>*/

