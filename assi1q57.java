/*57. Write a program in C++ to print the area of a hexagon.
Sample Output:
Print the area of a hexagon:
---------------------------------
Input the side of the hexagon: 6
The area of the hexagon is: 93.5307*/



import java.util.*;

public class assi1q57
{
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		
    double areaofhexagon,sideofhexagon;

        System.out.println(" Print the area of a hexagon:");
        System.out.println("--------------------------------");

            System.out.println("Input the side of the hexagon: ");
            sideofhexagon=sc.nextDouble();

            areaofhexagon= (6*(sideofhexagon*sideofhexagon))/(4*Math.tan(Math.PI/6));

               System.out.println("The area of the hexagon is: "+areaofhexagon+" ");

		}
}

/*

F:\java>javac assi1q57.java

F:\java>java assi1q57
 Print the area of a hexagon:
--------------------------------
Input the side of the hexagon:
6
The area of the hexagon is: 93.53074360871938

F:\java>*/

