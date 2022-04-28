/*46. Write a program in C++ to calculate the volume of a cylinder.
Sample Output:
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder : 4
Input the height of the cylinder : 8
The volume of a cylinder is : 401.92
*/

import java.util.*;

public class assi1q46
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
    	

    	int radius;
    	double volumeofcylinder;

            System.out.println("Calculate the volume of a cylinder :");
            System.out.println("-----------------------------------------");

                System.out.println("Input the radius of the cylinder : ");
                radius=sc.nextInt();

                    System.out.println(" Input the height of the cylinder : ");
                   double height=sc.nextDouble();

					volumeofcylinder=(3.14*radius*radius*height);

                    System.out.println("The volume of a cylinder is : "+volumeofcylinder);
        }
}

/*
F:\java>javac assi1q46.java

F:\java>java assi1q46
Calculate the volume of a cylinder :
-----------------------------------------
Input the radius of the cylinder :
4
 Input the height of the cylinder :
8
The volume of a cylinder is : 401.92

F:\java>*/
