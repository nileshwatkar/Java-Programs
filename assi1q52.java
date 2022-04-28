/*52. Write a program in C++ to enter two angles of a triangle and find the third
angle.
Sample Output:
Find the third angle of a triangle :
-----------------------------------------
Input the 1st angle of the triangle : 35
Input the 2nd angle of the triangle : 35
The 3rd of the triangle is : 110*/


import java.util.*;

public class assi1q52
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
			double angle1, angle2, angle3;

        System.out.println("Find the third angle of a triangle :");
         System.out.println("-----------------------------------------");

             System.out.println("Input the 1st angle of the triangle : ");
            angle1=sc.nextDouble();

             System.out.println("Input the 2nd angle of the triangle : ");
            angle2=sc.nextDouble();

                angle3=180-(angle1+angle2);

                    System.out.println("The 3rd of the triangle is : " +angle3);
		}
}

/*
F:\java>javac assi1q52.java

F:\java>java assi1q52
Find the third angle of a triangle :
-----------------------------------------
Input the 1st angle of the triangle :
35
Input the 2nd angle of the triangle :
35
The 3rd of the triangle is : 110.0

F:\java>
*/