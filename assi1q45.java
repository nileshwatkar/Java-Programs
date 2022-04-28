/*45. Write a program in C++ to calculate the volume of a cube.
Sample Output:
Calculate the volume of a cube :
---------------------------------------
Input the side of a cube : 5
The volume of a cube is : 125*/

import java.util.*;

public class assi1q45
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
    	

    	int side;
    	float volumeofcube;

           System.out.println(" Calculate the volume of a cube :");
            System.out.println("---------------------------------------");
			
                System.out.println("Input the side of a cube : ");
                side=sc.nextInt();
				

                volumeofcube=(side*side*side);

                    System.out.println("The volume of a cube is : "+volumeofcube);

        }
}
/*
F:\java>javac assi1q45.java

F:\java>java assi1q45
 Calculate the volume of a cube :
---------------------------------------
Input the side of a cube :
5
The volume of a cube is : 125.0

F:\java>*/