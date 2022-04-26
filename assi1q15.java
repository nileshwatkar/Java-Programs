/*15. Write a program in C++ to calculate the volume of a cube. 
Sample Output:
Calculate the volume of a cube :
---------------------------------------
Input the side of a cube : 5
The volume of a cube is : 125*/


import java.util.*;

public class assi1q15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
			
			System.out.println("Calculate the volume of a cube");
			
			System.out.println("Input the side of a cube:");
			
			double sideofCube=sc.nextDouble();
			
			double volumeofCube=sideofCube*sideofCube*sideofCube;
			
			
			System.out.println("The Volume of Cube is:"+volumeofCube);
	}
}

/*
F:\java>javac assi1q15.java

F:\java>java assi1q15
Calculate the volume of a cube
Input the side of a cube:
5
The Volume of Cube is:125.0

F:\java>

*/