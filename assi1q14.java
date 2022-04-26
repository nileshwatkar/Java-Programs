/*14. Write a program in C++ to calculate the volume of a sphere. 
Sample Output:
Calculate the volume of a sphere :
---------------------------------------
Input the radius of a sphere : 6
The volume of a sphere is : 904.32*/

import java.util.*;

public class assi1q14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	
		System.out.println("Calculate the volume of a sphere :");
		
		System.out.println("Input the radius of a sphere :");
		double radius=sc.nextDouble();
		
			double volumeSphere=(4*3.14*radius*radius*radius)/3;
			
			System.out.println("The volume of a sphere is :"+volumeSphere);
	}
}
		
/*
F:\java>javac assi1q14.java

F:\java>java assi1q14
Calculate the volume of a sphere :
Input the radius of a sphere :
6
The volume of a sphere is :904.32

F:\java>

*/