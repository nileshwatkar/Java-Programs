/*43. Write a language program which accepts the radius of a circle from the user
and compute the area and circumference.
Sample Output:
Find the area and circumference of any circle :
----------------------------------------------------
Input the radius(1/2 of diameter) of a circle : 5
The area of the circle is : 78.5397
The circumference of the circle is : 31.4159*/



import java.util.*;

public class assi1q43
{

public static void main(String[] args)

    {
            double area, circum;

                System.out.println("Find the area and circumference of any circle :");
               System.out.println(" ----------------------------------------------------");

			   {
					Scanner sc=new Scanner(System.in);
					

                    System.out.println("Input the radius(1/2 of diameter) of a circle :");
                    double radius=sc.nextDouble();

            circum = 2*3.14159*radius;
            area = 3.14159*(radius*radius);

                    System.out.println("The area of the circle is : " +area);
                    System.out.println("The circumference of the circle is : "+circum);
			   }
    }
}
/*
F:\java>javac assi1q43.java

F:\java>java assi1q43
Find the area and circumference of any circle :
 ----------------------------------------------------
Input the radius(1/2 of diameter) of a circle :
5
The area of the circle is : 78.53975
The circumference of the circle is : 31.4159

F:\java>*/

