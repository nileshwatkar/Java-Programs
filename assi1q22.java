/*Write a program in C++ to find the third angle of a triangle.
Sample Output:
Find the third angle of a triangle :
-----------------------------------------
Input the 1st angle of the triangle : 30
Input the 2nd angle of the triangle : 60
The 3rd of the triangle is : 90*/


import java.util.*;

public class assi1q22
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			
			double angle1,angle2,angle3;

        System.out.println("Find the third angle of a triangle");
        System.out.println("-------------------------------------------");

            System.out.println("Input the 1st angle of the triangle: ");
            angle1=sc.nextDouble();

            System.out.println("Input the 2nd angle of the triangle:");
            angle2=sc.nextDouble();

            angle3=angle1+angle2;

                    System.out.println("The 3rd of the triangle is: "+angle3);

		}
}
/*
F:\java>javac assi1q22.java

F:\java>java assi1q22
Find the third angle of a triangle
-------------------------------------------
Input the 1st angle of the triangle:
30
Input the 2nd angle of the triangle:
60
The 3rd of the triangle is: 90.0
*/